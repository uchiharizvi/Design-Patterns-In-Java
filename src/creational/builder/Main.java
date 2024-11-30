package creational.builder;

public class Main {
    public static void main(String[] args) {
        Product product = ProductBuilder.builder()
                .addName("AppleIphone")
                .addPrice(76000.00)
                .addQuantity(24)
                .build();

        System.out.println();
        System.out.println("ProductConcrete Name: " + product.getName());
        System.out.println("ProductConcrete Price: " + product.getPrice());
        System.out.println("ProductConcrete Quantity: " + product.getQuantity());
    }
}
