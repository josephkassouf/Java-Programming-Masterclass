// THE PRIME NUMBER CHALLENGE

public class Main {

    public static void main(String[] args) {

        for (int num = 2; num <= 30; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) System.out.println(num + " is a prime number");
        }

    }

}
