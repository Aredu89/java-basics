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
            int theGuess = scanner.nextInt();

            won = (theGuess == secretNumber);
            if(won) {
                System.out.println("Success! you guessed the secret number: " + secretNumber);
                break;
            } else {
                System.out.println("Sorry, your guess is incorrect.");
                System.out.println("You have " + (i-1) + "attempt(s) left.");
                System.out.println();
            }
        }
        if(!won) {
            System.out.println("You did not win. The secret number was: " + secretNumber);
        }

        scanner.close();
    }
}
