public class Main {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(10, 1);
        Ogre ogre = new Ogre(20, 3);

        System.out.println("Enemy has " + zombie.getHealthPoints() + " health points and can do an attack of " + zombie.getAttackDamage());
        System.out.println("Enemy has " + ogre.getHealthPoints() + " health points and can do an attack of " + ogre.getAttackDamage());

        System.out.println("Ogre Number of Enemies: " + ogre.getNumberOfEnemies());
        System.out.println("Zombie ID: " + zombie.getId());
        System.out.println("Ogre ID: " + ogre.getId());

        battle(zombie);
        battle(ogre);
    }

    public static void battle(Enemy e) {
        e.talk();
        e.attack();
    }
}
