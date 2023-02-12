public class Main {

    // Method overloading when class has multiple methods with the same name, though the methods are declared with different parameters
    // Execute a method with one name, but call it with different parameters - Java can resolve which method it needs to execute
    // Type Order and Number of parameters, in conjunction with the name = signature unique

    public static void main(String[] args) {
        calculateScore("Joe", 30);
        calculateScore(500);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + (score * 1000) + " points");
        return score;
    }

    public static int calculateScore(int score) {

        return calculateScore("Anonymous", score);

    }
}
