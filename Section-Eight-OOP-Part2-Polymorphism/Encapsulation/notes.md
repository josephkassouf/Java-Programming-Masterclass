### What Does Encapsulation Mean?
- `Encapsulation` means hiding things, by making them private, 
   or inaccessible
___
### Why Hide Things?
- Make the interface simpler, we may want to hide necessary details
- Protect the integrity of data of an object, may hide or restrict 
  access to some data operations
- Decouple the published interface from the internal details of 
  the class

### What do we mean by Interface here
- Talk about class's public or published interface, talking about 
  the class members that are exposed to or can access by calling code
- `API` is the public contract that tells others how to use the class.

## Not Using `Encapsilation`
### Problem 1
- Allowing direct access to data on an object, can potentially
  bypass checks, and additional processing, Your class has in 
  place to manage data.
### Problem 2
- Allowing direct access to fields, means calling code would need
  to change, when you edit any of the fields.
### Problem 3
- Omitting a constructor, that would accept initialization data, 
  may mean calling code is responsible for setting up this data
  on the new object.

## Benefits of `Encapsulation`
- You're not affecting any other code.
- Sort of like a black box

### Staying in Control
- Protect members of the class, and some methods from external 
  access
- Prevents calling code from bypassing the rules and constraints, 
  we've built into th class.
- When we create a new instance, it's initialized with valid data.

### Encapsulation Principles
#### To create an `EN` class, you want to:
- Create constructors for object initialization, which enforces
  that only objects with valid data are initialized.
- Use `private access modifier` for your fields.
- Use `Setters` & `Getters` methods sparingly, and only as needed.
- Use access modifiers that aren't private, only for methods that the
  calling code needs to use. 