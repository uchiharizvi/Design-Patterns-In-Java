# Decorator Pattern
Decorator Pattern can be used to add additional optional features over already existing Object

## Implementation

1. Given Base Product ( We will be using already created Product using Builder Pattern here)
2. Add Decorator Interface - This will extend the Product Class to add feature dynamically
3. Create Decorator Implementation - Each implementation add specific feature to the productConcrete
4. The Client code will build a productConcrete using the builder and dynamically add features using the decorators.