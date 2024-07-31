import java.util.Scanner;
class marksCalc {
	public static void main (String[] args) {
		Scanner marks = new Scanner(System.in);
		
		System.out.print("Enter the maths mark : ");
		double mMarks = marks.nextDouble();
		
		System.out.print("Enter the science mark : ");
		double sMarks = marks.nextDouble();
		
		System.out.print("Enter the english mark : ");
		double eMarks = marks.nextDouble();
		
		double tMarks = mMarks + sMarks + eMarks;
		
		System.out.println("Total marks : " + tMarks + "      Average : " + tMarks/3);
		
		
	}
}
