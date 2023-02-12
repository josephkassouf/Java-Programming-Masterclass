// SUM 3 AND 5 CHALLENGE
//
// CREATE A FOR LOOP USING A RANGE OF NUMBERS FROM 1 TO 1000.
// SUM ALL THE NUMBERS THAT CAN BE DIVIDED BY BOTH 3 AND 5.
// PRINT OUT THE NUMBERS THAT HAVE MET THE ABOVE CONDITIONS
// BREAK OUT OF THE LOOP ONCE YOU HAVE FOUND 5 NUMBERS THAT MEET THE CONDITION.
// AFTER BREAKING OUT OF THE LOOP, PRINT THE SUM OF THE NUMBERS
// TYPE IN MAIN METHOD.

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 15 == 0) {
                count++;
                sum += i;
                System.out.println("Found a match " + i);
            }
            if (count == 5) break;
        }

        System.out.println("Sum = " + sum);

    }

}
