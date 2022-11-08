package myExperiment;
import java.util.Scanner;

public class Fax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double charge = 3.00, p10 = 0.20, pplus = 0.10;
		
		System.out.print("Enter the number of page/s : ");
		int page = in.nextInt();
		
		if (page > 10) {
			double total = (charge * page) + (pplus * page);
			System.out.println("Total : " + total);
		}
		else {
			double total1 = (charge * page) + (p10 * page);
			System.out.println("Total : " + total1);
			
			in.close();
		}
		
	}

}
