import java.util.Scanner;

public class accessController {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int myAge = age.nextInt();

        if (myAge >= 18) {
            System.out.println("You can access to site.");
        } else {
            System.out.println("You can't access to site.");
        }
    }
}
