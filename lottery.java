import java.util.Random;
import java.util.Scanner;

import wNum.nextInt;

public class lottery {
    public static void main(String[] args) {
        Random rand = new Random();
        int randInt = rand.nextInt(10);
        Scanner num = new Scanner(System.in);

        System.out.print("Enter Your number : ");
        int uNumber = num.nextInt();

        if (randInt == uNumber) {
            System.out.println("You win Rs.1000.00.");
        } else {
            System.out.println("Try Again...");
            System.out.println("The winning number is " + randInt);
        }
    }

}
