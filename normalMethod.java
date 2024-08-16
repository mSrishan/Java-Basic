import java.util.Scanner;

public class normalMethod {
    public static void main(String[] args) {
        greet();

    }

    public static void greet() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String name = scan.next();

        System.out.println("Good morning!, " + name + ".");
    }
}
