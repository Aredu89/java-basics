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
        int whileTimes = 0;
        while(!done) {
            System.out.println("While Loop");
            System.out.print("Are we done? Y/N: ");

            String userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase("Y")) {
                done = true;
            }

            System.out.println();

            // Break the loop if we went through it 4 time
            whileTimes++;
            if(whileTimes > 3) {
                break;
            }
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
