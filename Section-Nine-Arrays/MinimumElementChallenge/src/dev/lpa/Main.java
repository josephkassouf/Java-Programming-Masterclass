// MINIMUM ELEMENT CHALLENGE
// Create a method called read integers that reads a comma delimited list of numbers,
// entered by the user from the console and then return an array containing those numbers in java
// Find the MIN in the array

package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] result = readIntegers();
        System.out.println(Arrays.toString(result));
        System.out.println("MIN = " + findMin(result));
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of numbers separated by commas: ");
        String input = scanner.nextLine();
        String[] numberStrings = input.split(",");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i].trim());
        }
        return numbers;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


}
