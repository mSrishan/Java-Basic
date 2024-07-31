import java.util.Scanner;
class loanEligibility {
	public static void main (String[] args){
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String uName = user.next();
		
		System.out.print("Enter your salary : ");
		double uSalary = user.nextDouble();
		
		System.out.print("Enter other incomes : ");
		double uOtherIncome = user.nextDouble();
		
		double totalIncome = uSalary + uOtherIncome ;
		double average = totalIncome/2;
		
		System.out.println("Your total income : "+totalIncome);
		System.out.println("Your average income : "+average);
		
		if(average>45000.00){
			System.out.println(uName + ", you are eligible for the loan. ");
		}else {
			System.out.println(uName + ", you are not eligible for the loan. ");
		}
     }
}
