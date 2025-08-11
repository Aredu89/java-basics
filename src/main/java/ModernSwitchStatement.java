import java.util.Scanner;

public class ModernSwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComputerType myComputerType = null;

        System.out.print("Enter computer type: ");
        String computerType = scanner.nextLine();

        // Convert the input to enum
        computerType = computerType.trim().toUpperCase();
        try {
            myComputerType = ComputerType.valueOf(computerType);
        }
        catch(IllegalArgumentException exc) {
            System.out.println("Invalid computer type entered: " + computerType);
            System.exit(1);
        }
        finally {
            scanner.close();
        }

        String description = switch(myComputerType) {
            case ComputerType.SMARTPHONE -> "Smartphone computer type";
            case ComputerType.TABLET -> "tablet computer type";
            case ComputerType.DESKTOP, ComputerType.COMPUTER -> "desktop computer type";
            // default -> "Unknown computer type";
        };

        System.out.println(description);

        scanner.close();
    }
}
