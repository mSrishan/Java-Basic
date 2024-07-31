import java.util.Scanner;
class elseIf {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the marks : " );
		int marks = input.nextInt();
		
		if(marks>=75) {
			System.out.print("A");
		}else if(marks>=65) {
			System.out.print("B");
		}else if(marks>=55) {
			System.out.print("C");
		}else if(marks>=35) {
			System.out.print("S");
		}else{
			System.out.print("F");
		}
		
	}
}
