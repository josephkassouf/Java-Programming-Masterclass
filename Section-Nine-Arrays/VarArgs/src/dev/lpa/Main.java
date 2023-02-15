package dev.lpa;

public class Main {
    public static void main(String... args) {
        String[] splitString = "Hello World Again".split(" ");
        printText(splitString);
    }

    public static void printText(String... testList) {
        for (String element : testList) {
            System.out.println(element);
        }
    }
}
