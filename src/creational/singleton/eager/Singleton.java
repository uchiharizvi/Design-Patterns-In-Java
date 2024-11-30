package creational.singleton.eager;

import java.util.function.Consumer;

/**
 * Eager Initialization approach for Singleton Design Pattern
 */
public class Singleton {
    /**
     * Create a private static instance at class loading time
     */
    private static final Singleton instance = new Singleton();

    /**
     * Private constructor to prevent external instantiation
     */
    private Singleton() {
    }

    /**
     * Public static method to get the instance
     */
    public static Singleton getInstance() {
        return instance; // Return the already created instance
    }

    public void performAction(Consumer<String> action) {
        action.accept("Hello, this is a Singleton Pattern using Consumer!");
    }
}
