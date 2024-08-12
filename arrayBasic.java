import java.util.Scanner;

public class arrayBasic {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = scan.nextInt();
        }
    }
}
