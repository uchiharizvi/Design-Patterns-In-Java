package structural.decorator;

/**
 * Builder Class
 * Note: no constructor needed
 * Instead we will be needing methods for setting property
 */
public class ProductBuilder {
    protected String name;
    protected String category;
    protected double price;

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
    public ProductBuilder addCategory(String category) {
        this.category = category;
        return this;
    }

    public ProductConcrete build() {
        return new ProductConcrete(this);
    }
}
