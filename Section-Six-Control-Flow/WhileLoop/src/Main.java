// JAVA HAS TWO TYPES OF WHILE LOOPS
// WHILE -> CONTINUE EXECUTING CODE BLOCK UNTIL THE LOOP EXPRESSION BECOMES FALSE
// DO WHILE -> EXECUTE THE CODE BLOCK ONCE, THEN CONTINUE EXECUTING UNTIL THE LOOP CONDITION BECOMES FALSE
// CONTINUE STATEMENT -> WILL STOP EXECUTING THE CURRENT ITERATION OF A BLOCK OF CODE IN A LOOP, AND START A NEW ITERATION

public class Main {
    public static void main(String[] args) {

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) continue;
            System.out.print(number + "_");
        }

//        int i = 1;
//        boolean isReady = false;
//
//        do {
//            if (i > 5) break;
//            System.out.println(i);
//            i++;
//            isReady = (i > 0);
//        }
//        while (isReady);

//        while (true) {
//            if (i > 5) break;
//            System.out.println(i);
//            i++;
//        }

//        while (i <= 5) {
//            System.out.println(i);
//            i++;
//        }

    }
}
