public class Main {
    public static void main(String[] args) {
        Enemy zombie = new Enemy();
        zombie.setTypeOfEnemy("Zombie");
        System.out.println(zombie.getTypeOfEnemy() + " has " + zombie.getHealthPoints() + " health points and can do an attack of " + zombie.getAttackDamage());

        zombie.talk();
        zombie.walkForward();
        zombie.attack();
    }
}
