public class Ogre extends Enemy {
    public Ogre(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk() {
        System.out.println("Ogre is slamming hands all around");
    }

    @Override
    public void specialAttack() {
        boolean didSpecialAttackWork = Math.random() < .05;
        if(didSpecialAttackWork) {
            setAttackDamage(getAttackDamage() + 4);
            System.out.println("Ogre's attack increased by 4!");
        }
    }
}
