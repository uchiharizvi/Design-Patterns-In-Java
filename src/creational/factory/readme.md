# Factory Design Pattern

The Factory Pattern is a creational design pattern used to create objects without specifying the exact class of the 
object that will be created. The Factory Pattern defines an interface for creating an object, but it’s the subclasses 
(or the factory class) that decide which class to instantiate. This pattern provides a way to 
delegate the instantiation logic.

Let us take an example here

Let us apply this pattern into the Product Creation

## Implementation

1. Create an interface Product
2. Create Implementations of Product
3. Create the Factory Class that will handle creation of Product Objects. Based on some logic (Criteria), 
   it will return an instance of Either Product
4. Invoke Factory from Main Instead of calling Product directly

## Advantages

1. Encapsulation of Object Creation:
    The Factory Pattern abstracts the creation logic from the client code. The client simply calls a method on the factory and gets the appropriate productConcrete without worrying about the instantiation process.
2. Flexibility to Change Product Classes:
    The factory can be modified to return different types of products without affecting the client code. If you add new productConcrete types, the client doesn’t need to change its code, only the factory class.
3. Decoupling of Object Creation:
   The factory decouples the client from the concrete classes. The client only knows about the productConcrete interface, not the actual implementation.