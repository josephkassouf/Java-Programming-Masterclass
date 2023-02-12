// LOOPING -> EXECUTE CODE A NUMBER OF TIMES.
// JAVA SUPPORTS SEVERAL STATEMENTS FOR LOOPING, OR EXECUTING CODE.
    // FOR -> FOR LOOP IS MORE COMPLEX TO SETUP, COMMONLY USED WHEN ITERATING OVER A SET OF VALUES
    // WHILE -> EXECUTES UNTIL A SPECIFIED CONDITION BECOMES FALSE
    // DO WHILE -> ALWAYS EXECUTES AT LEAST ONCE AND CONTINUES UNTIL A SPECIFIED CONDITION BECOMES FALSE

// FOR STATEMENT
    // for (init; expression; increment) {block statement}

// BREAK STATEMENT -> TRANSFERS CONTROL OUT OF AN ENCLOSING STATEMENT.



public class Main {
    public static void main(String[] args) {

        for (int counter = 0; counter <= 5; counter++) {

            System.out.println(counter);

        }

        for (double rate = 2.0; rate <= 5; rate++) {

            double interestAmount = calculateInterest(10_000, rate);
            System.out.println("$10,000 at " + rate + "% interest = " + interestAmount);

        }

        // MINI CHALLENGE
        for (double i = 7.5; i <= 10; i += 0.25) {

            double interestAmount = calculateInterest(100.00, i);
            if ( interestAmount > 8.5 ) break;
            System.out.println("$100.00 at " + i + "% interest = " + interestAmount);
            
        }

    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));

    }

}
