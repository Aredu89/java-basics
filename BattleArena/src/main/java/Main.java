public class Main {
    public static void main(String[] args) {
        String x = "Test";
        Enemy enemy = new Enemy();
        enemy.typeOfEnemy = "Zombie";
        System.out.println(enemy.typeOfEnemy + " has " + enemy.healthPoints + " health points and can do an attack of " + enemy.attackDamage);
    }
}
