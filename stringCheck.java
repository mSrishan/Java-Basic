import java.util.Scanner;
class stringCheck {
	public static void main (String[] args){
		Scanner uData = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String iEmail = uData.next();
		
		System.out.print ("Enter your password : ");
		int iPassword = uData.nextInt();
		
		String dbEmail = "srishan@gmail.com";
		int dbPassword = 1234;
		
		if(iEmail.equals(dbEmail) && iPassword == dbPassword){
			System.out.print("login success !");
		} else {
			System.out.print("login failed !");
		}
		
	}
}
