import java.sql.*;

import com.mysql.cj.jdbc.Driver;

import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(Config c){
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    c.getUrl(),
                    c.getUser(),
                    c.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Ad> all() {
        List<Ad> adsArray = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");

            while(rs.next()) {
                adsArray.add(new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description")));
            }
            return adsArray;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adsArray;
    }


    public Long insert(Ad ad) {
        try {
            Statement statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO ads(user_id, title, description) VALUES "
                    + "(" + ad.getUserId() + ", "
                    + "'" + ad.getTitle() +"', "
                    + "'" + ad.getDescription() + "')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}