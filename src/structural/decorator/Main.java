package structural.decorator;

public class Main {
    public static void main(String[] args) {
        ProductConcrete iphone = ProductBuilder.builder()
                .addName("IPhone")
                .addCategory("Smartphone")
                .addPrice(74000.00)
                .build();

        System.out.println("Base ProductConcrete: " + iphone.getDetails());
        //Add Wireless Charger
        Product iphoneWithWirelessCharging = new WirelessCharging(iphone);
        System.out.println("With Wireless Charging: " + iphoneWithWirelessCharging.getDetails());

        Product iphoneWithExtendedWarranty = new ExtendedWarranty(iphone);
        System.out.println("With Wireless Charging: " + iphoneWithExtendedWarranty.getDetails());
    }
}
