import java.util.Arrays;

public class reverceArray {
    public static void main(String[] args) {
        int[] ar = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int[] reverseArray = reverseArr(ar);
        System.out.println(Arrays.toString(reverseArray));
    }

    public static int[] reverseArr(int ar[]) {
        int[] revAr = new int[9];
        for (int i = 8; i >= 0; i--) {
            revAr[i] = ar[ar.length - 1 - i];
        }
        return revAr;
    }
}
