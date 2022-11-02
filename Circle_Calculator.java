import java.util.*;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double pi = Math.PI();
		
		System.out.println("Press 1 for Circumference");
		System.out.println("Press 2 for Diameter");
		System.out.println("Press 3 for Area\n");
		
		System.out.print("What are we gonna solve?: ");
		int choice = in.nextInt();
		
		if (choice == 1) {
			System.out.print("Enter the value of radius: ");
			double radius = in.nextDouble();
			double circum = 2 * radius * pi;
			System.out.println("Circumference of Cirlce: " + circum);
		}
		else if (choice == 2) {
			System.out.print("Enter the value of radius: ");
			double radius = in.nextDouble();
			double diameter = radius * radius;
			System.out.println("Diameter of Circle: " + diameter);
		}
		else
			System.out.print("Enter the value of radius: ");
		double radius = in.nextDouble();
		double area = pi * radius * radius;
		System.out.println("Area of Circle: " + area);
		
		in.close();
	}

}
