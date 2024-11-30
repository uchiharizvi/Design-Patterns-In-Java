package creational.abstract_factory;

public class Iphone implements Product{
    private String modelVer;

    public Iphone(String modelVer) {
        this.modelVer = modelVer;
    }

    @Override
    public String getDetails() {
        return "IPhone Model: " + modelVer;
    }
}
