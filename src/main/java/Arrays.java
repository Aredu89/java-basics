import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        String[] colors = { "Green", "Bluer", "Red", "Yellow", "Black" };
        // Enhanced for example
        for(String el : colors) {
            System.out.println(el);
        }

        double[] userInput = getGradesFromUserInput();

        System.out.println("Grades entered:");
        int gradeNum = 1;
        for(double el : userInput) {
            System.out.println("Grade " + gradeNum + ": " + el);
            gradeNum ++;
        }

        System.out.println();

        double gradeAverage = computeGradeAverage(userInput);
        System.out.println("The average is: " + gradeAverage);
    }

    public static double computeGradeAverage(double[] grades) {
        double sum = 0.0;

        for(double el : grades) {
            sum += el;
        };

        return sum / grades.length;
    }

    public static double[] getGradesFromUserInput() {
        // Initialization
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many grades will you enter?: ");
        int numGrades = scanner.nextInt();

        System.out.println();

        //Initialize array
        double[] userInputGrades = new double[numGrades];

        for(int i=0; i < userInputGrades.length; i++) {
            System.out.print("Enter grade number " + (i + 1) +": ");
            userInputGrades[i] = scanner.nextDouble();
        }
        scanner.close();
        return userInputGrades;
    }
}
