package myExperiment;

import java.util.Scanner;
public class Students {

public static void main(String[] args) { 
	
	Scanner input = new Scanner(System.in);
	
	double male, female, total, m_percent, f_percent, 
	irr_male, irr_female, irr_total, irr_mp, irr_fp;
	
	System.out.print("Enter the number of Males: ");
	male = input.nextDouble();
	System.out.print("Enter the number of Females: ");
	female = input.nextDouble();
	
	total = male + female;
	m_percent = ((male / total) * 100);
	f_percent = ((female / total) * 100);
	
	System.out.println("---------------------------");
	System.out.println("Number of Students: " + (int) total);
	System.out.println("Male percentage: " + String.format("%.2f", m_percent) + "%");
	System.out.println("Female percentage: " + String.format("%.2f", f_percent) + "%\n");
	
	System.out.print("Enter number of irregular male: ");
	irr_male = input.nextDouble();
	System.out.print("Enter number of irregular female: ");
	irr_female = input.nextDouble();
	
	irr_total = irr_male + irr_female;
	
	irr_mp = ((irr_male / irr_total) * 100);
	irr_fp = ((irr_female/ irr_total) * 100);
	System.out.println("---------------------------");
	System.out.println("Number of Irregular Student/s: " + (int)irr_total);
	System.out.println("Irregular Male: " + String.format("%.2f", irr_mp) + "%");
	System.out.println("Irregular Female: " + String.format("%.2f", irr_fp) + "%");
	
	input.close();

}
}
