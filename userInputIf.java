import java.util.Scanner;
class userInputIf {
	public static void main (String[] args){
		Scanner age = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int userAge = age.nextInt();
		
		if(userAge >= 18) {
			System.out.println("You can access");
		} else {
			System.out.println("You can't access");
		}
	}
}
