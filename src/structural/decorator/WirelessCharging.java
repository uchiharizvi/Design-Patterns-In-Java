package structural.decorator;

public class WirelessCharging implements ProductDecorator {
    private final Product product;

    public WirelessCharging(Product product) {
        this.product = product;
    }

    @Override
    public String getDetails() {
        return product.getDetails() + " + $2000.0";
    }
}
