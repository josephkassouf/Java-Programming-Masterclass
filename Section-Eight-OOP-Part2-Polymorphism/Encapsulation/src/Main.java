public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Dan", -1, "Gun");
        Player player2 = new Player("Joe");
        System.out.println("Player 1 current health is at " + player1.healthRemaining());
        player1.loseHealth(100);
        System.out.println(player1);
        System.out.println(player2);
    }
}

