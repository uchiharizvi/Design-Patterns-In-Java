# Singleton Design Pattern

### **Implementations**

1. Lazy Initialization
   * Initially initialize with null during class loading
   * Once Main Function calls getInstance() creates a new instance
   * Another Object Created, checks if instance exists and return the same instance
   * The first object creates a new instance, and the subsequent objects just refer the same instance
2. Eager Initialization
   * Initializes during class loading with Singleton Instance
   * Once Main Function calls getInstance() returns already created instance
   * Another Object Created, returns already created instance