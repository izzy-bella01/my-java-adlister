import java.util.ArrayList;
import java.util.List;

public class ListProductsDao implements Products{
    private List<Product> products = new ArrayList<>(); // an arraylist to dummy what will eventually be a database we're talking to

    public ListProductsDao() {
        insert(new Product("pressure washer", 299.99));
        insert(new Product("nailgun", 99.45));
        insert(new Product("white trim baseboard", 10.50));

    } // constructor - whenever this app gets going, i want three products to  start with everytime. use the 'inset' method and make these three products please

    public List<Product> all() {
        return this.products;
    }

    public void insert(Product productToInsert) {
        this.products.add(productToInsert);
    }
}
