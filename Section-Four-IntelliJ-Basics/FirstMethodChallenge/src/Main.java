public class Main {
    public static void main(String[] args) {

        displayHighScorePosition("Joseph", 1500);
        displayHighScorePosition("Bill", 999);
        displayHighScorePosition("Jan", 499);
        displayHighScorePosition("Josephine", 99);
        displayHighScorePosition("Debby", -110);

    }

    public static void displayHighScorePosition(String playerName, int playerScore) {
        System.out.println(playerName + " managed to get into position " + calcHighScorePosition(playerScore)
                + " on the high score list");
    }

    public static int calcHighScorePosition(int playersScore) {

        int position = 4;
        if (playersScore >= 1000) position =  1;
        else if (playersScore >= 500) position =  2;
        else if (playersScore >= 100) position =  3;

        return position;

    }
}
