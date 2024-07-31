import java.util.Scanner;
class userInput1 {
	public static void main (String[] args) {
		Scanner age = new Scanner(System.in);
		
		System.out.print("Enter your current age : ");
		int userAge = age.nextInt();
		
		int futureAge = userAge + 7;
		
		System.out.println("Your age after 7 years is : "+futureAge);
		
	}
}
 
