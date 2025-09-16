public class Main {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(10, 1);
        Ogre ogre = new Ogre(20, 3);

        System.out.println("Enemy has " + zombie.getHealthPoints() + " health points and can do an attack of " + zombie.getAttackDamage());
        System.out.println("Enemy has " + ogre.getHealthPoints() + " health points and can do an attack of " + ogre.getAttackDamage());

        zombie.talk();
        zombie.spreadDisease();
        zombie.attack();

        ogre.talk();
        ogre.walkForward();
    }
}
