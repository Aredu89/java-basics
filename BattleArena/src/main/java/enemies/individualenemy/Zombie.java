package enemies.individualenemy;

import enemies.Enemy;

public class Zombie extends Enemy implements iZombie {
    public Zombie(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk() {
        System.out.println("*Grumbling...*");
    }

    @Override
    public void specialAttack() {
        boolean didSpecialAttackWork = Math.random() < .50;
        if(didSpecialAttackWork) {
            setHealthPointsRemaining(getHealthPointsRemaining() + 2);
            System.out.println("Zombie regenerated 2 HP!");
        }
    }

    @Override
    public void battleStance() {
        System.out.println("Zombie cracks neck and sticks arms out.");
    }
}
