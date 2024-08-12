import java.util.Scanner;

public class employeesalary {
    public static void main(String[] args) {
        double[] salaryArr = new double[12];
        Scanner salary = new Scanner(System.in);
        double totalSalary = 0;
        double averageSalary;
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter the employee" + (i + 1) + " salary : ");
            salaryArr[i] = salary.nextDouble();
            totalSalary += salaryArr[i];

        }
        averageSalary = totalSalary / 12;
        System.out.println("The total salary of the employees is: " + totalSalary);
        System.out.println("The average salary of the employees is: " + averageSalary);

    }
}
