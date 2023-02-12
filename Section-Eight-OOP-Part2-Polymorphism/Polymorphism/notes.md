# Polymorphism
___
- `Polymorphism` means many forms
- Lets us write code to call a method, but at runtime, this
  method's behavior can be different for different objects.
    - This means the behavior that occurs, while the program is 
      executing, depends on the runtime type of the object.
    - And the runtime type, might be different from the declared
      type in the code.
    - The declared type has to have some kind of relationship to the
      runtime type, and `inheritance` is one way to establish this 
      relationship.
    - We'll talk about how to use `inheritance`, to support `polymorphism`
___
## What is var?
- Special Contextual keyword in `Java`, that lets our code take advantage of 
  Local Variable Type Inference.
- By using `var` as the type, we're telling Java to figure out the compile-time type for us.
___
## Local Variable Type Inference (LVTI)
- One of the benefits is to help with readability of the code, & to reduce boilerplate code.
- It's called `Local Variable Type Inference` for a reason, because:
  - Can't be used in `Field Declarations` on a `class`
  - Can't be used in `Method Signatures` either as a parameter type or a return type.
  - Can't be used without an assignment, because type can't be inferred in that case.
  - Can't be assigned a `null literal`, again because type can't be inferred. 
___
## Run Time vs. Compile Time Typing
- Think of compiled time as the `declared` type.
- Type is declared either as a variable reference, or a method return type, or a method parameter.
___
## Instanceof operator
- The `instanceof` operator, lets you test the type of object or instance.
  - The reference variable your testing for is on the left operand.
  - The type your testing for, is the right operand
___
## Pattern Matching for the instanceof operator
- If the JVM can identify that the object matches the type, it can extract data 
  from the object, without casting.
- For this operator, the object can be assigned to a binding variable, which is called syfy.
- `e.g. unknownObject instanceof ScienceFiction syfy`
- The variable syfy (if the instanceof method returns true) is already typed as a ScienceFiction variable