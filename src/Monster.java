public class Monster extends Creature {
    public Monster(int health, int minDamage, int maxDamage, int attack, int defence) {
        super(minDamage, maxDamage, attack, defence);
        this.health = health;
    }
}
