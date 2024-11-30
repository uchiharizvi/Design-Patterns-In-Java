package creational.factory;

public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        Product iphone = factory.createProduct("Iphone");
        iphone.create();

        Product android = factory.createProduct("Android");
        android.create();
    }
}
