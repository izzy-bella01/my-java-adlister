import java.util.List;

public interface Products {
    List<Product> all(); // get all products and return it as a 'List'[can poly into an arraylist]

    void insert(Product productToInsert); //
}
