import java.util.Scanner;

public class incomeAnalysis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of families in th village : ");
        int count = scan.nextInt();
        double[] mSalary = new double[count];
        double[] oIncome = new double[count];
        double totalMonthlySalary = 0;
        double totalOtherIncome = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter monthly salary of family" + (i + 1) + " : ");
            mSalary[i] = scan.nextDouble();
            System.out.print("Enter other income of family" + (i + 1) + " : ");
            oIncome[i] = scan.nextDouble();
        }

        for (int i = 0; i < count; i++) {
            totalMonthlySalary += mSalary[i];
            totalOtherIncome += oIncome[i];
        }
        System.out.println("");

    }
}
