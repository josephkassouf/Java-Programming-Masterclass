## 2-Dimensional Array
- Notice the 2 sets of square brackets on the left side of the assignment.
- A 2-Dimensional array doesn't have to be a uniform matrix. 
  - Nested arrays can be different sizes.
  - Initialize a 2-dimensional array and define its size
    - ```java 
         int[][] array = new int[3][3];
      ```
    - It says we have an array of 3 nested arrays and each nested array will have three ints.
    - The left is the outer and the right is the inner
  - Defaults the values to **Zero**
    
| Array Initializer formatted over multiple lines                        |
|------------------------------------------------------------------------|
| int[][] array = {                                                      |
| {1, 2, 3},                                                             |
| {11, 12, 13},                                                          |
| {21, 22, 23},                                                          |
| {31, 32, 33}                                                           |
| };                                                                     |

| Array Initializer declared one line                                     |
|-------------------------------------------------------------------------|
| `int[][] array = {{1, 2, 3}, {11, 12, 13}, {21, 22, 23}, {31, 32, 33}}` |

- A lot of ways to declare a 2-dimensional array.
- The first way to declare a 2-dimensional array is the most common
  - ```java
        int[][] myDoubleArray;
        int[] myDoubleArray[];
    ```

## Declaring 

```java
   // Declares and instantiates an array of 3 integers arrays, whose sizes are not specified
   int[][] myArray = new int[3][];
```