// SUM DIGIT CHALLENGE

public class Main {
    public static void main(String[] args) {

        // Print the sum of 236 -> 11
        System.out.println(sumDigits(236));

    }

    public static int sumDigits(int number) {

        if (number < 0) return -1;

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;

    }

} 
