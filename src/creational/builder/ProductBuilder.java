package creational.builder;

/**
 * Builder Class
 * Note: no constructor needed
 * Instead we will be needing methods for setting property
 */
public class ProductBuilder {
    protected String name;
    protected double price;
    protected int quantity;

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public ProductBuilder addName(String name) {
        this.name = name;
        return this;
    }
    public ProductBuilder addPrice(double price) {
        this.price = price;
        return this;
    }
    public ProductBuilder addQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Product build() {
        return new Product(this);
    }
}
