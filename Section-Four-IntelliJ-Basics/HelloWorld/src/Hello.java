public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Joe");

        boolean isAlien = false;

        if (!isAlien) System.out.println("It is not an alien!");

        double var1 = 20.00;
        double var2 = 80.00;
        double result = (var1 + var2) * 100;
        double theRemainder = result % 40.0;

        boolean isResultTrue = theRemainder == 0;

        if (!isResultTrue) {
            System.out.println("Got some remainders");
        }
    }
}
