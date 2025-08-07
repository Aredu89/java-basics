import java.util.Scanner;

public class StringInputDemo {
    public static void main(String[] args) {
        // Create the scanner for reading the input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your favorite color? ");
        String color = scanner.nextLine();

        System.out.print("What is your hobby? ");
        String hobby = scanner.nextLine();

        System.out.println("Your favorite color is " + color);
        System.out.println("Your hobby is " + hobby);

        System.out.print("Enter grade exam 1: ");
        double gradeExam1 = scanner.nextDouble();

        System.out.print("Enter grade exam 2: ");
        double gradeExam2 = scanner.nextDouble();

        System.out.print("Enter grade exam 3: ");
        double gradeExam3 = scanner.nextDouble();

        double gradeAvarage = (gradeExam1 + gradeExam2 + gradeExam3) / 3;
        String formattedAvarage = String.format("%.2f", gradeAvarage);
        System.out.println("Grade Exam 1: " + gradeExam1);
        System.out.println("Grade Exam 2: " + gradeExam2);
        System.out.println("Grade Exam 3: " + gradeExam3);
        System.out.println("Avarage: " + formattedAvarage);

        // Convert string to int
        int count = Integer.parseInt("49");

        scanner.close();
    }
}
