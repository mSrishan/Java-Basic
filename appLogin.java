import java.util.Scanner;

public class appLogin {
    public static void main(String[] args) {
        String dbEmail = "srishanmandawala@gmail.com";
        String dbPassword = "25App#4";

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter the Email : ");
            String uEmail = input.next();
            System.out.print("Enter the password : ");
            String uPassword = input.next();
            if (dbEmail.equals(uEmail) && dbPassword.equals(uPassword)) {
                System.out.println("Welcome...");
                break;
            } else {
                System.out.println("Try again...");
            }
            if (i == 4) {
                System.out.println("Your account is locked.");
            }
        }

    }
}
