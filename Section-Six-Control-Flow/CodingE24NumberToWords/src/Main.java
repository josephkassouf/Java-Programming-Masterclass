// NUMBER TO WORDS EXERCISE 24
//
// Write a method called numberToWords with one int parameter named number.
//
// The method should print out the passed number using words for the digits.
//
// If the number is negative, print "Invalid Value".
//
// To print the number as words, follow these steps:
//
// Extract the last digit of the given number using the remainder operator.
//
// Convert the value of the digit found in Step 1 into a word. There are 10 possible
// values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding
// word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
//
// Remove the last digit from the number.
//
// Repeat Steps 2 through 4 until the number is 0.
//
// The logic above is correct, but in its current state, the words will be printed in reverse order.
// For example, if the number is 234, the logic above will produce the output "Four Three Two" instead
// of "Two Three Four". To overcome this problem, write a second method called reverse.
//
// The method reverse should have one int parameter and return the reversed number (int).
// For example, if the number passed is 234, then the reversed number would be 432.
// The method reverse should also reverse negative numbers.
//
// Use the method reverse within the method numberToWords in order to print the words in the correct order.
//
// Another thing to keep in mind is any reversed number with leading zeroes (e.g.
// the reversed number for 100 is 001). The logic above for the method numberToWords will
// print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem,
// write a third method called getDigitCount.
//
// The method getDigitCount should have one int parameter called number and return the count of the digits
// in that number. If the number is negative, return -1 to indicate an invalid value.
// For example, if the number has a value of 100, the method getDigitCount should return 3 since the number
// 100 has 3 digits (1, 0, 0).
//
// Example Input/Output - getDigitCount method
    // getDigitCount(0); should return 1 since there is only 1 digit
    // getDigitCount(123); should return 3
    // getDigitCount(-12); should return -1 since the parameter is negative
    // getDigitCount(5200); should return 4 since there are 4 digits in the number
//
// Example Input/Output - reverse method
    // reverse(-121); should  return -121
    // reverse(1212); should return  2121
    // reverse(1234); should return 4321
    // reverse(100); should return 1
//
// Example Input/Output - numberToWords method
    // numberToWords(123); should print "One Two Three".
    // numberToWords(1010); should print "One Zero One Zero".
    // numberToWords(1000); should print "One Zero Zero Zero".
    // numberToWords(-12); should print "Invalid Value" since the parameter is negative.

public class Main {
    public static void main(String[] args) {

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

    }

    public static void numberToWords(int num) {

        if (num < 0) System.out.println("Invalid Value");

        int digitLength = getDigitCount(num);
        int reverseInput = reverse(num);

        for (int i = 0; i < digitLength; i++) {
            int currentDigit = reverseInput % 10;
            reverseInput /= 10;

            if (currentDigit > 0) {
                if (currentDigit == 1) System.out.println("One");
                if (currentDigit == 2) System.out.println("Two");
                if (currentDigit == 3) System.out.println("Three");
                if (currentDigit == 4) System.out.println("Four");
                if (currentDigit == 5) System.out.println("Five");
                if (currentDigit == 6) System.out.println("Six");
                if (currentDigit == 7) System.out.println("Seven");
                if (currentDigit == 8) System.out.println("Eight");
                if (currentDigit == 9) System.out.println("Nine");
            }
            else System.out.println("Zero");
        }

    }

    public static int reverse(int num) {

        int reverse = 0;
        while (num != 0) {
            int lastNumber = num % 10;
            reverse = reverse * 10 + lastNumber;
            num /= 10;
        }

        return reverse;

    }

    public static int getDigitCount(int num) {

        if (num < 0) return -1;
        if (num == 0) return 1;

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;

    }

}

