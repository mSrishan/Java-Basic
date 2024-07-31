import java.util.Scanner;
class jobSelectionApplication {
	public static void main (String[] args) {
		Scanner job = new Scanner(System.in);
		
		System.out.print ("Enter your name : ");
		String name = job.next();
		
		System.out.print ("Enter your age : ");
		int age = job.nextInt();
		
		System.out.print("Did you pass ? (true/false): ");
		boolean didPass = job.nextBoolean();
		
		if (didPass && age > 25) {
			System.out.print ("Eligible for the job.");
		} else {
			System.out.print ("Not eligible for the job.");
		
	}
	}
}
