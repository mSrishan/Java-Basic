import java.util.Scanner;

public class searchOnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = { 12, 34, 23, 45, 78, 26, 78, 56, 90 };

        System.out.print("Enter the number you want to search : ");
        int num = scan.nextInt();
        boolean isAvailable = searchArray(ar, num);
        System.out.println(isAvailable);
    }

    public static boolean searchArray(int[] ar, int num) {
        for (int i : ar) {
            if (num == i) {
                return true;
            }
        }
        return false;

    }
}
