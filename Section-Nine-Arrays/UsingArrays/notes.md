## Why use Arrays
- Manage items of th same type
- Common behaviour for array would b sorting, initializing values, copying the array
  and Finding an element.

## Finding a match
- Different algorithms for searching and matching elements in lists.

## Searching Sequentially
- Looping start to finish
- Find a match stop looping
- Called **Linear Search** or **sequential**
- **If elements are sorted, using linear is inefficient**

## Using Intervals to Search
- Split each section up, testing the values at the boundaries, & based on that, split
  again into smaller sections, narrowing the number of elements to test.
- This type of searching in software is called **interval searching**
- Within sequential & interval categories, there are numerous existing algorithms in each.
- One of the most common interval searches is the **binary search** 
  - **Intervals** are continually **split into two**.

## Arrays.binarySearch
- **Static Method**
- Use this method to test if a value is already in our array.
- Things to remember:
  - Array has to be **sorted**
  - Duplicate values in the array, no guarantee which one it'll match on.
  - Elements must be comparable.
- This method returns:
  - **Position of a match** if found
  - Return **-1** when no match was found
  - A positive number **may not be the position of the first match**
  - If array has duplicate values, and you need to find the first element, other methods should be used. 