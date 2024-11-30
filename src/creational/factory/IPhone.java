package creational.factory;

public class IPhone implements Product{
    @Override
    public void create() {
        System.out.println("Apple Iphone is Created");
    }
}
