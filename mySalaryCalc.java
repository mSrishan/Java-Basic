import java.util.Scanner;

public class mySalaryCalc {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        for (int i = 1; i < 12; i++) {
            System.out.print(i + ".Enter Employee's name : ");
            String uName = calc.next();
            System.out.print("Enter the employee's basic salary : ");
            double uSalary = calc.nextDouble();
            System.out.print("Enter the employee's allowances : ");
            double uAllowance = calc.nextDouble();
            double ETF = 0.03 * uSalary;
            double EPF = 0.08 * uSalary;

            System.out.println(uName + "'s Monthly Final salary is " + (uSalary + uAllowance - ETF - EPF));
        }
    }
}
