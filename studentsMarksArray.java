import java.util.Scanner;

public class studentsMarksArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many students in the class : ");
        int std = scan.nextInt();

        int[] programming = new int[std];
        int[] database = new int[std];
        int totalProgramming = 0;
        int totalDatabase = 0;
        for (int i = 0; i < std; i++) {
            System.out.print("Enter the programming marks of student" + (i + 1) + " : ");
            programming[i] = scan.nextInt();
            System.out.print("Enter the database marks of student" + (i + 1) + " : ");
            database[i] = scan.nextInt();

            totalProgramming += programming[i];
            totalDatabase += database[i];
        }
        int avgProgramming = totalProgramming / std;
        int avgDatabase = totalDatabase / std;

        System.out.println("Average marks of programming : " + avgProgramming);
        System.out.println("Average marks of database : " + avgDatabase);

    }
}
