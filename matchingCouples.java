import java.util.Scanner;

public class matchingCouples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get boy's name
        System.out.print("Enter the boy's name: ");
        String boyName = scanner.nextLine().trim();

        // Prompt for girlfriend names
        System.out.println("Enter girlfriend names one by one (type 'exit' to quit):");

        while (true) {
            System.out.print("Enter girlfriend name: ");
            String girlName = scanner.nextLine().trim();

            // Check for exit condition
            if (girlName.equalsIgnoreCase("exit")) {
                System.out.println("No match found. Exiting application.");
                break;
            }

            // Check if the first letters match
            if (!girlName.isEmpty() && girlName.charAt(0) == boyName.charAt(0)) {
                System.out.println(boyName + " and " + girlName + " matched!");
                break;
            }
        }

        scanner.close();
    }

}
