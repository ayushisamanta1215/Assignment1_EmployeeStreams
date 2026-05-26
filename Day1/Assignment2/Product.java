import java.util.Optional;

public class Product {
    int productId;
    String name;
    double price;
    boolean inStock;
    double discountPercentage;

    public Product(int productId, String name, double price, boolean inStock, double discountPercentage) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.discountPercentage = discountPercentage;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public String getName() {
        return Optional.ofNullable(name).orElse("No Name Available");
    }

    public double getFinalPrice() {
        return price - (price * discountPercentage / 100);
    }

    @Override
    public String toString() {
        return productId + " " + getName() + " Price: " + getFinalPrice();
    }
}
