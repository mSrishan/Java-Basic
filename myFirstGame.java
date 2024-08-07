import java.util.Random;
import java.util.Scanner;

public class myFirstGame {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        Random sNumber = new Random();

        for (int i = 1; i < 30; i++) {
            System.out.println("Player no : " + i);
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter a number between 1 and 10 : ");
                int uNumber = uInput.nextInt();
                int rNumber = sNumber.nextInt(10) + 1;
                if (uNumber == rNumber) {
                    System.out.println("You have won the game");
                    break;
                } else {
                    System.out.println("You have lost the game");
                    System.out.println("The winning number is : " + rNumber);
                }
            }
            System.out.println("Game Over!");
        }

    }

}
