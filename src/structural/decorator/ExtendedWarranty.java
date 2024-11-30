package structural.decorator;

public class ExtendedWarranty implements Product {
    private final Product product;

    public ExtendedWarranty(Product product) {
       this.product = product;
    }

    @Override
    public String getDetails() {
        return product.getDetails() + " + $800.0";
    }
}
