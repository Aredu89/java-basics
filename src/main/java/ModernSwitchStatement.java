import java.util.Scanner;

public class ModernSwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter computer type: ");
        String computerType = scanner.nextLine();

        computerType = computerType.toLowerCase();

        String description = switch(computerType) {
            case "smartphone" -> "Smartphone computer type";
            case "tablet" -> "tablet computer type";
            case "desktop", "computer" -> "desktop computer type";
            default -> "Unknown computer type";
        };

        System.out.println(description);

        scanner.close();
    }
}
