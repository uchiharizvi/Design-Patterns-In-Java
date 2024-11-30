package creational.builder;

public class Main {
    public static void main(String[] args) {
        Product product = ProductBuilder.builder()
                .addName("AppleIphone")
                .addPrice(76000.00)
                .addQuantity(24)
                .build();

        System.out.println();
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Product Quantity: " + product.getQuantity());
    }
}
