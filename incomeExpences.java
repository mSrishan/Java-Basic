import java.util.Scanner;
class incomeExpences {
	public static void main (String[] args) {
		Scanner details = new Scanner(System.in);
		
		System.out.print("Enter your Name : ");
		String name = details.next();
		
		System.out.print("Enter your Age : ");
		int age = details.nextInt();
		
		if(age >= 18) {
			System.out.print("Enter your monthly income : ");
			double mIncome = details.nextDouble();
			
			System.out.print("Enter your other incomes : ");
			double oIncome = details.nextDouble();
			
			double tIncome = mIncome + oIncome;
			
			System.out.print("Enter your food expences : ");
			double fExpences = details.nextDouble();
			
			System.out.print("Enter your vehicle expences : ");
			double vExpences = details.nextDouble();
			
			System.out.print("Enter your accomodation expences : ");
			double aExpences = details.nextDouble();
			
			double tExpences = fExpences + vExpences + aExpences;
			
			System.out.println (name + ", You can save Rs." +(tIncome - tExpences) + " for your future.");
			
		} else {
			System.out.println(name + ", you are not eligible for use this application.");		
			}
			
	}
}
