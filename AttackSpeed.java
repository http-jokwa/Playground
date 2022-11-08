package myExperiment;

import java.util.Scanner;
public class AttackSpeed {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base attack speed: ");
		double base = sc.nextDouble();
		System.out.print("Enter the bonus attack speed%: ");
		int bonus = sc.nextInt();
		System.out.print("Enter the level: ");
		int level = sc.nextInt();
		
		float total = (float) (base * (1 + ((double)bonus/100 * (level -1 ))));
		
		System.out.println("The characater's current attack speed is " + total%.2f);

	}

}
