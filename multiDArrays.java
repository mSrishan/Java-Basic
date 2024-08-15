import java.util.Scanner;

public class multiDArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] capacity = new int[225][3];

        for (int i = 0; i < 225; i++) {
            System.out.println("Minister number " + (i + 1) + " : ");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter vehicle number " + (j + 1) + " : ");
                capacity[i][j] = scan.nextInt();

            }
            System.out.println(capacity[i][0] + " " + capacity[i][1] + " " + capacity[i][2]);
        }
    }
}
