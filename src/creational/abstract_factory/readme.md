# Abstract Factory Design Pattern

The Abstract Factory Pattern is a creational design pattern that provides an interface for creating families of 
related or dependent objects without specifying their concrete classes. This pattern is particularly useful when the 
system needs to work with multiple families of products, and it ensures that the products from the same family are 
compatible with one another.

Here’s a basic example of how you can implement the Abstract Factory Pattern in Java:

## Implementation

1. Create Abstract Product Interface. All Product Types will Implement this Interface.
2. Create Product Implementations
3. Define Abstract Factory Interface - Which will define methods to create different types of Products.
4. Create Factory Implementations
5. Create Main Execution - Initialize ProductFactory, use factory to create a product(s) of factory type

## Advantages

1.	Separation of Concerns:
      Each factory is responsible for creating products of a specific category, adhering to the Single Responsibility Principle.
2.	Scalability:
Adding a new product category (e.g., Clothing) only requires creating a new concrete factory and product classes, without modifying existing code.
3.	Flexibility:
The client code depends only on the abstract factory and product interfaces, making it easy to extend or modify.

## Difference over Family Pattern

1. Use Abstract Factory When You Have Families of Products
   * Factory Method: Produces a single product.
   * Abstract Factory: Produces multiple related products as a family, ensuring compatibility between them.
   * Suppose you’re building a GUI application. With a Factory Method, you can create a Button. 
   But with Abstract Factory, you can create a family of compatible components like a Button, 
   Checkbox, and Menu — all styled consistently (e.g., Windows or Mac theme).
2. Ensures Consistent Product Families
   * Abstract Factory guarantees that all products created by the factory belong to the same family and are 
   designed to work well together.
   * If you use a Factory Method to create a Button, another unrelated factory could create a Checkbox with inconsistent 
   behavior or style.
   * If you use a MacFactory, you’ll get a MacButton and MacCheckbox, ensuring that both are consistent and compatible.
3. Decouples Client Code from Concrete Factories
   * Factory Method: The client is tied to one type of product at a time.
   * Abstract Factory: The client can switch between entire families of products by simply changing the factory instance.
   * Imagine a theme switcher in your application:
     * With Factory Method: You would need to individually change how each product (e.g., Button, Checkbox) is instantiated.
     * With Abstract Factory: You just swap the factory (e.g., from MacFactory to WindowsFactory), and all related products change accordingly.
4. Scalability for Multiple Product Families
   * When the number of product types grows, the Abstract Factory Pattern is more scalable than Factory Method.
   * If you have:
     * Product categories like Electronics, Furniture, and Clothing. 
     * Subcategories within each (e.g., Laptop, Chair, Shirt).
     * Using Factory Method, you’d need:
       * Separate factories for Electronics, Furniture, and Clothing.
     * With Abstract Factory, you can easily group the related products under a family and use the same factory to handle them.

## When to Use Factory Method Over Abstract Factory

1. **Simple Requirements**: Use Factory Method if you need to create only one product type (e.g., a specific type of Product object).
2.	**Less Complexity**: Factory Method is easier to implement and understand. Abstract Factory adds complexity by introducing families of products and multiple creation methods.
3. **No Dependency Between Products**: If the products are unrelated and don’t require compatibility (e.g., creating Button and TextField independently), a Factory Method is sufficient.