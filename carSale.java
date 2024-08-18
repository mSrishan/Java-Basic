import java.util.Arrays;
import java.util.Scanner;

public class carSale {
    public static void main(String[] args) {
        Car[] myCars = new Car[2];

        for (int i = 0; i < 2; i++) {

            myCars[i] = new Car();
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter car id : ");
            myCars[i].id = scan.nextInt();
            System.out.print("Enter the brand : ");
            myCars[i].brand = scan.next();
            System.out.print("Enter the model : ");
            myCars[i].model = scan.next();
            System.out.print("Is have turbo ?(true/false) : ");
            myCars[i].isHaveTurbo = scan.nextBoolean();

        }

        for (int i = 0; i < myCars.length; i++) {
            System.out.println("Car" + (i + 1));
            System.out.println("Id : " + myCars[i].id);
            System.out.println("Brand : " + myCars[i].brand);
            System.out.println("Model : " + myCars[i].model);
            if (myCars[i].isHaveTurbo) {
                System.out.println("This car has turbo.");
            } else {
                System.out.println("This car hasn't turbo.");
            }
        }

    }
}

class Car {
    int id;
    String brand;
    String model;
    boolean isHaveTurbo;
}
