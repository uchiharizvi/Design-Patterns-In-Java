package creational.abstract_factory;

import creational.builder.ProductBuilder;

public class Main {
    public static void main(String[] args) {
        ProductFactory iPhoneFactory = new IPhoneFactory();
        Product iphone13 = iPhoneFactory.createProduct("13");
        Product iphone14 = iPhoneFactory.createProduct("14");

        ProductFactory androidFactory = new AndroidFactory();
        Product note2 = androidFactory.createProduct("note 2");
        Product note7 = androidFactory.createProduct("note 7");

        System.out.println(iphone13.getDetails());
        System.out.println(note2.getDetails());
        System.out.println(iphone14.getDetails());
        System.out.println(note7.getDetails());
    }
}
