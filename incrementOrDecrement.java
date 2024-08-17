import java.util.Scanner;

public class incrementOrDecrement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] cSalary = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Enter the salary of employee" + (i + 1) + " : ");
            cSalary[i] = scan.nextDouble();
            System.out.print(
                    "If you want to increment the salary, enter 'in'. If you want to decrement the salary, enter 'de' : ");
            String choice = scan.next();
            System.out.print("Enter  percentage you want increment/decrement the salary by (%) : ");
            double percent = scan.nextDouble();
            calcSalary(i, cSalary, choice, percent);
        }
    }

    public static void calcSalary(int i, double cSalary[], String choice, double percent) {
        double[] uSalary = new double[12];
        if (choice.equals("in")) {
            uSalary[i] = cSalary[i] + (cSalary[i] * percent / 100);
            System.out.println("Your salary is increase, Your updated salary is : " + uSalary[i]);
        } else if (choice.equals("de")) {
            uSalary[i] = cSalary[i] - (cSalary[i] * percent / 100);
            System.out.println("Your salary is descrease, Your updated salary is : " + uSalary[i]);
        }

    }
}
