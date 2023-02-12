//  METHOD OVERLOADING CHALLENGE
//
// Create two methods with the same name: convertToCentimeters
    // First method has one parameter of type int, which represents the entire height in inches.
    // You'll convert inches to centimeters in this method, and pass back the number of centimeters, as a double
    //
    // Second method has two parameter of type, one to represent height in feet, and one to represent the
    // remaining height in inches

public class Main {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(6, 4) + " inches");
        System.out.println(convertToCentimeters(convertToCentimeters(6, 4)) + " centimeters");

    }

    public static double convertToCentimeters(int inches) {

         return inches * 2.54;

    }

    public static int convertToCentimeters(int feet, int inches) {

        return (feet * 12) + inches;

    }

}