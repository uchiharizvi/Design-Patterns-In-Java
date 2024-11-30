package creational.abstract_factory;

public class Android implements Product{
    private String modelVer;

    public Android(String modelVer) {
        this.modelVer = modelVer;
    }

    @Override
    public String getDetails() {
        return "Android Version: " + modelVer;
    }
}
