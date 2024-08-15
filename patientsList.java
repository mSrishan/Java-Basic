import java.util.Scanner;

public class patientsList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] hospital = new String[7][50];
        double[] fee = new double[50];
        double[] avgIN = new double[7];
        double totalIncome = 0.00;
        double avgIncome = 0.00;

        for (int i = 0; i < 7; i++) {
            System.out.println("Doctor " + (i + 1));
            for (int j = 0; j < 50; j++) {
                System.out.println("Enter the patient" + (j + 1) + " name : ");
                hospital[i][j] = scan.next();
                System.out.println("Enter the patient" + (j + 1) + " fee : ");
                fee[j] = scan.nextDouble();
                totalIncome += fee[j];
                avgIncome = totalIncome / 50;
            }
            avgIN[i] = avgIncome;
            System.out.println("Doctor" + (i + 1) + " total income is " + totalIncome + ".");
        }
    }
}
