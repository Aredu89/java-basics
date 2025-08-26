import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] colors = { "Green", "Bluer", "Red", "Yellow", "Black" };
        // Enhanced for example
        for(String el : colors) {
            System.out.println(el);
        }

        double[] userInput = getGradesFromUserInput(scanner);

        System.out.println("Grades entered:");
        int gradeNum = 1;
        for(double el : userInput) {
            System.out.println("Grade " + gradeNum + ": " + el);
            gradeNum ++;
        }

        System.out.println();

        double gradeAverage = computeGradeAverage(userInput);
        Arrays.sort(userInput);
        System.out.println("The average is: " + gradeAverage);
        System.out.println("The highest grade is: " + userInput[userInput.length - 1]);
        double numToSearch = getNumberToSearch(scanner);
        int indexFound = Arrays.binarySearch(userInput, numToSearch);
        boolean found = (indexFound >= 0);
        if(found) {
            System.out.println(numToSearch + " was found in the grades!");
        } else {
            System.out.println(numToSearch + " was NOT FOUND!");
        }

        scanner.close();
    }

    public static double computeGradeAverage(double[] grades) {
        double sum = 0.0;

        for(double el : grades) {
            sum += el;
        };

        return sum / grades.length;
    }

    public static double[] getGradesFromUserInput(Scanner scanner) {
        // Initialization
        System.out.print("How many grades will you enter?: ");
        int numGrades = scanner.nextInt();

        System.out.println();

        //Initialize array
        double[] userInputGrades = new double[numGrades];

        for(int i=0; i < userInputGrades.length; i++) {
            System.out.print("Enter grade number " + (i + 1) +": ");
            userInputGrades[i] = scanner.nextDouble();
        }
        return userInputGrades;
    }

    public static double getNumberToSearch(Scanner scanner) {
        System.out.print("What grade do you want to search for? ");
        return scanner.nextDouble();
    }
}
