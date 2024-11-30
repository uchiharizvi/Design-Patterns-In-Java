package creational.builder;

public class Product {
    private final String name;
    private final double price;
    private final int quantity;

    public Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.quantity = builder.quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
