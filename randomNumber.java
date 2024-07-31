import java.util.Random;
import java.util.Scanner;
class randomNumber {
	public static void main (String[] args){
		Random rand = new Random();
		int randInt = rand.nextInt(10);
		
		Scanner uInput = new Scanner(System.in);
	
		
		System.out.print("Enter your name : ");
		
		String uName = uInput.next();
		
		System.out.print("Enter your number : ");
		
		int uNumber = uInput.nextInt();
		
		if(randInt == uNumber ){
			System.out.println(uName + ", you win Rs.100.00");
			System.out.print("Winning number is " + randInt );
		} else {
			System.out.println("Try Again......");
			System.out.print("Winning number is " + randInt );
			}
		
		
		
		
	}
}
