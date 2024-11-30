package creational.singleton.lazy;

import java.util.function.Consumer;

/**
 * Eager Initialization approach for Singleton Design Pattern
 */
public class Singleton {
    /**
     * private static instance (initially null)
     */
    private static Singleton instance;

    /**
     * Private constructor to prevent external instantiation
     */
    private Singleton() {}

    /**
     * Public static method to get the instance (Lazy initialization)
     */
    public static Singleton getInstance() {
        // If no instance exists, create one
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void performAction(Consumer<String> action) {
        action.accept("Hello, this is a Singleton Pattern using Consumer!");
    }

}
