import java.util.Scanner;

public class TwoDimArraysDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rows? ");
        int numRows = scanner.nextInt();
        System.out.print("how many columns? ");
        int numCols = scanner.nextInt();

        scanner.close();

        int[][] table = new int[numRows][numCols];

        // Compute multiplication table values
        for(int row=0; row < numRows; row++) {

            for(int col=0; col < numCols; col++) {
                table[row][col] = (row+1) * (col+1);
            }
        }

        System.out.println();
        for(int row=0; row < numRows; row++) {

            for(int col=0; col < numCols; col++) {
                System.out.print(" " + table[row][col]);
            }
            System.out.println();
        }
    }
}
