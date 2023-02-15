// THE ARRAY CHALLENGE
// Create an array of randomly generated integers.
// Print the array before you sort
// Print the array after you sort


package dev.lpa;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println("Randomly Generated array of numbers");
        System.out.println(Arrays.toString(firstArray));

        System.out.println("Array sorted");
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        System.out.println("Array order reversed");
        reverse(firstArray);
        System.out.println(Arrays.toString(firstArray));
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] intArray = new int[len];

        for (int i = 0; i < len; i++) {
            intArray[i] = random.nextInt(100);
        }

        return intArray;
    }

    public static void reverse(int[] arr) {
        // i will start from the beginning of the array
        // j will start from the end of the array
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            // swap the elements at indices i and j
            int temp = arr[i];      // store the value at index i in a temporary variable
            arr[i] = arr[j];        // set the value at index i to the value at index j
            arr[j] = temp;          // set the value at index j to the value in the temporary variable
        }
    }


}
