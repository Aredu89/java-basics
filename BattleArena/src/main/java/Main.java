public class Main {
    public static void main(String[] args) {
        Enemy zombie = new Enemy("Zombie", 10, 1);
        System.out.println(zombie.getTypeOfEnemy() + " has " + zombie.getHealthPoints() + " health points and can do an attack of " + zombie.getAttackDamage());

        zombie.talk();
        zombie.walkForward();
        zombie.attack();
    }
}
