import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int upperBound = 5;

        Random random = new Random();
        int secretNumber = random.nextInt(upperBound) + 1;

        int maxAttempts = 3;

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("You have " + maxAttempts + " attempts");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        boolean won = false;

        for(int i=maxAttempts; i > 0; i--) {
            System.out.print("Guess a number between 1 and " + upperBound + ": ");
        }
    }
}
