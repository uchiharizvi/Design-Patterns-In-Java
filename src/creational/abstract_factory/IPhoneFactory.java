package creational.abstract_factory;

public class IPhoneFactory implements ProductFactory{
    @Override
    public Product createProduct(String modelVer) {
        return new Iphone(modelVer);
    }
}
