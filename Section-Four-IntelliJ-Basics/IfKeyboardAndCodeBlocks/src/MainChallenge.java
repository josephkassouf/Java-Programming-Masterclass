public class MainChallenge {
    public static void main(String[] args) {

        printGameOver(5000, 5, 100);
        printGameOver(10000, 8, 200);

    }

    public static void printGameOver(int score, int levelCompleted, int bonus) {

        System.out.println("Your highScore is " + calcFinalScore(score, levelCompleted, bonus));

    }

    public static int calcFinalScore(int score, int levelCompleted, int bonus) {
        boolean gameOver = true;
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

}
