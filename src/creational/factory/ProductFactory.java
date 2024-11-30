package creational.factory;

public class ProductFactory {
    public Product createProduct(String type) {
        if(type.equalsIgnoreCase("Iphone")) {
            return new IPhone();
        } else if (type.equalsIgnoreCase("Android")) {
            return new Android();
        }
        return null;
    }
}
