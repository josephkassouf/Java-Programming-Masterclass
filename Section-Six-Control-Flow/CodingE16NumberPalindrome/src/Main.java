// NUMBER PALINDROME EXERCISE 16
//
// Write a method called isPalindrome with one int parameter called number.
// The method needs to return a boolean.
//
// It should return true if the number is a palindrome number otherwise it should return false.
// Check the tips below for more info about palindromes.
//
// Example Input/Output
    // isPalindrome(-1221); → should return true
    // isPalindrome(707); → should return true
    // isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {

        // Store the original number
        int original = number;

        // Reverse the number
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        // Validate original and reversed
        return original == reversed;

    }
    
}
