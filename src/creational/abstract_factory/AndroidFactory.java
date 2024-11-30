package creational.abstract_factory;

public class AndroidFactory implements ProductFactory{
    @Override
    public Product createProduct(String modelVer) {
        return new Android(modelVer);
    }
}
