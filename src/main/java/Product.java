import java.io.Serializable;

public class Product implements Serializable {
    private String name; // field/prop #1
    private double price; // field/prop #2

    public Product() {} // default blank constructor

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    // below: getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
