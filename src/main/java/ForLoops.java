import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nested for loops
        for (int row = 1; row <= 5; row++) {

            for(int col = 1; col <= 5; col++) {
                int value = row * col;
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        //While loops
        boolean done = false;
        while(!done) {
            System.out.println("While Loop");
            System.out.print("Are we done? Y/N: ");

            String userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase("Y")) {
                done = true;
            }

            System.out.println();
        }

        // Do While loop
        boolean done2 = false;
        do {
            System.out.println("Do While Loop");
            System.out.print("Are we done? Y/N: ");

            String userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase("Y")) {
                done2 = true;
            }

            System.out.println();
        } while(!done2);

        scanner.close();
    }
}
