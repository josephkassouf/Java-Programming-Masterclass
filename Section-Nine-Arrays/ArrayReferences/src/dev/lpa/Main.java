package dev.lpa;

public class Main {
    public static void main(String[] args) {

        // newIntArray is referencing myIntArray in memory. It's Immutable.
        // When we change the value of one of the arrays both will change.
        int[] myIntArray = new int[5];
        System.out.println(myIntArray);
        int[] newIntArray = myIntArray;
        System.out.println(newIntArray);

    }
}
