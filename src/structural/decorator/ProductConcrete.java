package structural.decorator;

public class ProductConcrete implements Product {
    private final String name;
    private final String category;
    private final double price;

    protected ProductConcrete(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.category = builder.category;
    }

    @Override
    public String getDetails() {
        return name + " (" + category + ") - $" + price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
