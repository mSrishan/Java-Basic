import java.util.Scanner;

public class incomeAnalysis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of families in th village : ");
        int count = scan.nextInt();
        double[] mSalary = new double[count];
        double[] oIncome = new double[count];
        double[] total = new double[count];
        double totalMonthlySalary = 0;
        double totalOtherIncome = 0;
        double totalWithAllowances = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter monthly salary of family" + (i + 1) + " : ");
            mSalary[i] = scan.nextDouble();
            System.out.print("Enter other income of family" + (i + 1) + " : ");
            oIncome[i] = scan.nextDouble();
            total[i] = mSalary[i] + oIncome[i];
            if (total[i] < 50000.00) {
                total[i] += 5000.00;
            }
            totalWithAllowances += total[i];
        }

        for (int i = 0; i < count; i++) {
            totalMonthlySalary += mSalary[i];
            totalOtherIncome += oIncome[i];
        }
        double totalIncome = totalMonthlySalary + totalOtherIncome;
        System.out.println("Total monthly income of all the families : " + totalIncome);
        System.out.println("Total monthly income of all the families with allowances : " + totalWithAllowances);
    }

}
