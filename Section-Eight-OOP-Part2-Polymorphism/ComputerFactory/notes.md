# Inheritance vs Composition
- Inheritance defines an `IS A relationship`

- Composition defines a `HAS A relationship`

### Composition

- Make the combination of classes act like a single
  coherent object

### Use Composition or Inheritance or Both?
- General rule, when designing programs in Java. Look at composition
  first.

### Why is composition preferred over inheritance in many design?
- Composition is more flexible. You can add parts in or remove them.
- Less likely to have a downstream effect.
- Provides functional reuse outside the class hierarchy.
- Java's **IN** breaks **EN**, subclasses may need direct access to a 
  parents state or behavior. 

### Why is Inheritance lees flexible?
- Adding a class to, or removing a class from, a class hierarchy, 
  may impact all subclasses from that point. 
- A new subclass may not need all the functionality or attributes
  of its parent class.
