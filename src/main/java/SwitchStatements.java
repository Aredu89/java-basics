import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your computer type: ");
        String computerType = scanner.nextLine();

        computerType = computerType.toLowerCase();

        switch(computerType) {
            case "smartphone":
                System.out.println("Smartphone computer type");
                break;
            case "tablet":
                System.out.println("tablet computer type");
                break;
            default:
                System.out.println("Computer type unknown");
                break;
        }

        scanner.close();
    }
}
