## Arrays
- Data structure, that allows you to store a sequence of values all the same 
  type.
- You can have arrays for any of the primitive types. 

## Declaring an Array
- Specify the type of the elements you want in the array.
- Then you include square brackets in the declaration, which is key for Java to identify
  the variable as an array.
- Or you can include the square brackets after the variable name.

| Array Variable Declaration |
|----------------------------|
| `int[] integerArray; `     |
| `String[] nameList; `      |
| `String courseList;`       |

## Instantiating an Array

| Array Creation                      | Object Creation                           |
|-------------------------------------|-------------------------------------------|
| `int[] integerArray = new int[10];` | `StringBuilder sb = new StringBuilder();` |

- Use the `new` keyword, to instantiate it.
- We instantiate using square brackets and not parentheses.
- The size of the array is fixed when we specify the size of the array.

## The Array Initializer
- Array Initializer, makes the job of instantiating an array easier.

| Array Initializer                                     |
|-------------------------------------------------------|
| `int[] firstFivePositives = new int[]{1, 2, 3, 4, 5}` |

## The Array Initializer as an Anonymous Array
- Java allows you to drop `new int[]`
- Only can be used in a declaration statement.

| The Array Initializer                            |
|--------------------------------------------------|
| `int[] firstFivePositives = {1, 2, 3, 4, 5}`     |
| `String[] names = {"Andy", "Dwight", "Charles"}` |

## Array initialization & Default Elements Values
- When you don't use an array initializer, all array elements get
  initialized to the default value for that type
- For primitive types, this is **Zero** for any kind of
  **Numeric Primitive** like int, double or short
- For **Booleans**, default value will be false.
- For any **Class** type, elements will be initialized to **null**

## The Enhanced For Loop, the For Each Loop
- Designed to walk through elements in the array, or some collections.
- It processes **One Element at a time**, from the **first** element
  to the **Last**

| Enhanced For Loop                   | Basic For Loop                     |
|-------------------------------------|------------------------------------|
| `for (decleration : collection) {}` | `for (init; expression; increment` |

- The separator character between components is **colon** and not a semicolon
- The **first** part is a **declaration expression**
  - Includes the typ & variable name.

## java.util.Arrays
- Inherits java.util.Objects functionality.
- Array type comes with very little built-in functionality.
- Helper class named java.util.Arrays

## Printing elements in an array using Arrays.toString()
- **toString()** method on this helper class, prints out all the array elements.
- `String arrayElementsInAString = Arrays.toString(newArray)`
  