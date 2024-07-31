import java.util.Scanner;
class oddEven {
	public static void main (String[] args){
		Scanner num = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int uNumber = num.nextInt();
		
		if (uNumber%2 == 0){
			System.out.println(uNumber + " is a even number.");
		}else {
			System.out.println(uNumber + " is a odd number.");
		}
	}
}
