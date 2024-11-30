# Builder Design Pattern

### Build a Product Object that requires name, price and quantity

### Implementation

1. Product Class
   * Only getters for member vars
   * Constructor Takes (Builder) as param
   * Sets values of variables via Builder
2. Product Builder Class
   * Static Builder Method - Return new Instance of Builder Class
   * Adds Price, Name and Quantity (Adds Properties)
   * finally Builds the object (return the Product Object) - new Product(ProductBuilder Instance)

## Need?


## Applicable Scenario
