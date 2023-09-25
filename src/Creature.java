public class Creature {

    protected int attack;
    protected int defence;
    protected int health;
    protected int minDamage;
    protected int maxDamage;
    protected boolean isAlive;

    public Creature(int minDamage, int maxDamage, int attack, int defence) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attack = attack;
        this.defence = defence;
        isAlive = true;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (this.health <= 0) {
            isAlive = false;
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack < 1 || attack > 30) {
            return;
        }
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        if(defence < 1 || defence > 30) {
            return;
        }
        this.defence = defence;
    }
    public boolean isAlive() {
        return isAlive;
    }

    public void kick(Creature target) {
        boolean success = false;
        int attackModifier = this.attack - target.getDefence() + 1;
        for (int i = 0; i < attackModifier; i++) {
            if ((int)(Math.random() * 6) == 5 || ((int)(Math.random() * 6) == 6)) {
                success = true;
            }
        }
        if (success) {
            target.setHealth(target.getHealth() -
                    (int) (Math.random() * (maxDamage - minDamage) + 1));
        }
    }

}
