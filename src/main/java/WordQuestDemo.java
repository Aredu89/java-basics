import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordQuestDemo {
    public static void main(String[] args) throws IOException {

        String dataFilePath = "data/sample-words.txt";
        String secretWord = getRandomWord(dataFilePath);
        int maxAttempts = 10;

        char[] gameBoard = new char[secretWord.length()];
        final char EMPTY_PLACE_HOLDER = '_';
        Arrays.fill(gameBoard, EMPTY_PLACE_HOLDER);

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO WORD QUEST");

        boolean hasMissingLetters = true;

        while(maxAttempts > 0 && hasMissingLetters) {
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

                hasMissingLetters = containsEmptyChars(gameBoard, EMPTY_PLACE_HOLDER);
            } else {
                System.out.println("Incorrect");
                maxAttempts--;
            }

            System.out.println("Remaining attempts: " + maxAttempts);
            System.out.println();
        }

        // End of game
        if(hasMissingLetters) {
            System.out.println("You ran out of attempts. The secret word was: " + secretWord);
        } else {
            System.out.println("Success!! You revealed the secret word: " + secretWord);
        }

        scanner.close();
    }

    private static String getRandomWord(String dataFilePath) throws IOException {
        List<String> linesList = Files.readAllLines(Path.of(dataFilePath));
        String[] words = linesList.toArray(new String[0]);

        Random random = new Random();
        int index = random.nextInt(words.length);

        String theWord = words[index];

        return theWord.toUpperCase();
    }

    private static boolean containsEmptyChars(char[] gameBoard, char emptyPlaceHolder) {
        for(char temp : gameBoard) {
            if(temp == emptyPlaceHolder) {
                return true;
            }
        }
        return false;
    }
}
