public class Player extends Creature {
    private final int MAX_HEALTH;
    private int healCount;

    public Player(int MAX_HEALTH, int minDamage, int maxDamage, int attack, int defence) {
        super(minDamage, maxDamage, attack, defence);
        this.MAX_HEALTH = MAX_HEALTH;
        this.health = MAX_HEALTH;
        healCount = 0;
    }

    public void heal() {
        if (healCount < 4 && health < MAX_HEALTH) {
            this.health = (int) (0.3 * MAX_HEALTH);
            healCount++;
        }
    }

}
