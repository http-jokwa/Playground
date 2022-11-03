import java.util.*;

public class Paycheck {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your salary per hour: ");
		double salary = sc.nextDouble();
		System.out.println("Enter number of hours: ");
		double hrs = sc.nextDouble();
		
		double SSS = 350D, PhilHealth = 250D;
		double gross = salary * hrs;
		double deduct = SSS + PhilHealth;
		double netpay = gross - SSS - PhilHealth;
		
		System.out.println("\nGross Salary: " + gross);
		System.out.println("Deducted Salary; " + deduct);
		System.out.println("Net Pay: " + netpay);
		
		}
}
