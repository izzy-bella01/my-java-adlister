import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowAdsServlet", urlPatterns = "/ads")
public class ShowAdsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Ads adsDao = DaoFactory.getAdsDao();

        List<Ad> adsArr = adsDao.all();

        req.setAttribute("adsArr", adsArr);
        req.getRequestDispatcher("/ads/index.jsp").forward(req, resp);
    }
}
