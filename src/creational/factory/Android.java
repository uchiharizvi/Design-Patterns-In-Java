package creational.factory;

public class Android implements Product{
    @Override
    public void create() {
        System.out.println("Android Phone is Created");
    }
}
