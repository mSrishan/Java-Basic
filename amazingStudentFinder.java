import java.util.Scanner;

public class amazingStudentFinder {
    public static void main(String[] args) {
        int avgMarks;
        Scanner std = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the student name : ");
            String stdName = std.next();
            System.out.println("Enter the mark =>");
            System.out.println("Programming : ");
            int stdProgramming = std.nextInt();
            System.out.println("Web Development : ");
            int stdWeb = std.nextInt();
            System.out.println("Mobile Development : ");
            int stdMobile = std.nextInt();

            int totalMarks = stdProgramming + stdWeb + stdMobile;
            avgMarks = totalMarks / 3;
            System.out.println(stdName + "'s average mark is " + avgMarks);
            if (avgMarks > 90) {
                System.out.println("Found amazing student.");
                break;
            }
        }
    }
}
