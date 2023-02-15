// The Reverse Array Challenge
// Write a method called reverse, take an array as a parameter and returns the reverse order of an array

package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = getRandomArray(5);
        System.out.println("Not Reversed");
        System.out.println(Arrays.toString(arr1));
        reverse(arr1);
        System.out.println("Reversed");
        System.out.println(Arrays.toString(arr1));

    }

    public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }
}
