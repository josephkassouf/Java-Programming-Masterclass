// DECIMALCOMPARATOR EXERCISE 6
//
// Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
// The method should return boolean, and it needs to return true if two double numbers
// are the same up to three decimal places. Otherwise, return false.
//
// EXAMPLES OF INPUT/OUTPUT:
// areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
// areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
// areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
// areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.

public class Main {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.1755, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }

    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {

        int num1 = (int) (n1 * 1000);
        int num2 = (int) (n2 * 1000);

        if (num1 == num2) return true;

        return false;

    }

}


