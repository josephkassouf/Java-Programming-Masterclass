public class Player {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public Player(String fullName) {
        this(fullName, 100, "Gun");
    }

    public Player(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0) this.healthPercentage = 1;
        else if (health > 100) this.healthPercentage = 100;
        else this.healthPercentage = health;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + fullName + '\'' +
                ", health=" + healthPercentage +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            System.out.println("Game over");
        }
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage += extraHealth;
        if (healthPercentage > 100) {
            healthPercentage = 100;
            System.out.println("Player was restored to 100%");
        }
    }

}
