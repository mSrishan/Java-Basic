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
            if (uEmail == dbEmail && uPassword == dbPassword) {
                System.out.println("Welcome...");
                break;
            }
        }

    }
}
