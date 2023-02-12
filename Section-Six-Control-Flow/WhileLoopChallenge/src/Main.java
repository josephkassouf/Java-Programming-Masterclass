// WHILE LOOP CHALLENGE
//
// CREATE A METHOD CALLED ISEVENNUMBER THAT TAKE PARAMETER INT
// PURPOSE IS TO DETERMINE IF THE ARGUMENT IS AN EVEN NUMBER ELSE FALSE
// CREATE A WHILE LOOP AND TEST THE VALUES BETWEEN 5 AND 20;
//
// PART 2: SUM UP THE EVEN NUMBERS AND ODD NUMBERS AND STOP THE LOOP WHEN YOU FIND 5 EVEN NUMBERS

public class Main {
    public static void main(String[] args) {

        int number = 4;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= 20) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }

            System.out.println(number + " " + isEvenNumber(number));
            evenCount++;
            if (evenCount >= 5) break;
        }

        System.out.println("Odd numbers found = " + oddCount);
        System.out.println("Even numbers found = " + evenCount);

    }

    public static boolean isEvenNumber(int number) {

        if (number < 0) return false;
        return number % 2 == 0;

    }
}
