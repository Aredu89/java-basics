import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordQuestDemo {
    public static void main(String[] args) {

        String secretWord = getRandomWord();
        int maxAttempts = 10;

        char[] gameBoard = new char[secretWord.length()];
        Arrays.fill(gameBoard, '_');

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO WORD QUEST");

        boolean wordNotReveal = true;

        while(maxAttempts > 0 && wordNotReveal) {
            System.out.print("Current word: ");
            System.out.println(gameBoard);

            System.out.println();
            System.out.print("Guess a letter: ");

            String userInput = scanner.next().toUpperCase();
            char guess = userInput.charAt(0);

            boolean isGuessCorrect = false;
            for (int i=0; i < secretWord.length(); i++) {
                if(secretWord.charAt(i) == guess) {
                    gameBoard[i] = guess;

                    isGuessCorrect = true;
                }
            }

            // Update game status
            if(isGuessCorrect) {
                System.out.println("Good job! You found a match!");

                wordNotReveal = containsUnderscore(gameBoard);
            } else {
                System.out.println("Incorrect");
                maxAttempts--;
            }

            System.out.println("Remaining attempts: " + maxAttempts);
            System.out.println();
        }

        // End of game
        if(wordNotReveal) {
            System.out.println("You ran out of attempts. The secret word was: " + secretWord);
        } else {
            System.out.println("Success!! You revealed the secret word: " + secretWord);
        }

        scanner.close();
    }

    private static String getRandomWord() {
        String[] words = {"Java", "Airplane", "Friend"};

        Random random = new Random();
        int index = random.nextInt(words.length);

        String theWord = words[index];

        return theWord.toUpperCase();
    }

    private static boolean containsUnderscore(char[] gameBoard) {
        for(char temp : gameBoard) {
            if(temp == '_') {
                return true;
            }
        }
        return false;
    }
}
