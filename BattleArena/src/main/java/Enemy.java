public class Enemy {
    private int healthPoints;
    private int attackDamage;

    public Enemy (int healthPoints, int attackDamage) {
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
    };

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void talk() {
        System.out.println("I am a enemy, be prepared to fight!");
    }

    public void walkForward() {
        System.out.println("Enemy moves closer to you");
    }

    public void attack() {
        System.out.println("Enemy attacks for " + attackDamage + " damage");
    }
}
