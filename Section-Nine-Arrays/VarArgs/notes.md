## Arrays as method parameters
`public static void main(String[] args) {...}`
- The parameter to the main method, is an array of String.
- We can pass an array of Strings to this method, when it's called
- Or we use this method as an entry point to the application.
  - Pass data on the command line to this method.

## Variable Arguments (varargs)
`public static void main(String... args) {...}`
- Special designation for Java, that means Java will take 0+ many Strings, as arguments to thi method. And create an 
  array with which to process them.

## When can you use `varargs`
- **Can only be one variable argument in a method**
- **Variable argument must be the last argument**