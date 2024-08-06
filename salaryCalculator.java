import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        for (int i = 1; i < 11; i++) {
            System.out.print("Enter Employee's name : ");
            String name = userInput.next();
            System.out.print("Enter Employee" + i + " salary : ");
            double salary = userInput.nextDouble();
            System.out.print("Enter Employee" + i + " bonus salary : ");
            double bonusSalary = userInput.nextDouble();

            double averageSalary = (salary + bonusSalary) / 2;

            System.out.println(name + "'s average salary is " + averageSalary);

        }
    }

}
