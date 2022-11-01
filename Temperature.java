package myExperiment;

import java.util.*;

public class Temperature {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Temperature Convertion");
		System.out.println("----------------------");
		System.out.println("Press 1 for Celcius to Kelvin");
		System.out.println("Press 2 for Fahrenheit to Celcius");
		System.out.println("Press 3 for Kelvin to Fahrenheit");
		System.out.println("----------------------");

		System.out.print("Choose convertion : ");
		int choose = in.nextInt();
		
		if (choose == 1) {
			myKelvin();
		}
		else if (choose == 2) {
			myCelcius();
		}
		else
			myFahrenheit();
		
		
	}
	static double myKelvin() {
		double celcius, kelvin;
		
		System.out.print("Enter a temperature for Celcius : ");
		celcius = in.nextDouble();
		kelvin = 273.15 + celcius;
		System.out.println("----------------------");
		System.out.println("Temperature for Kelvin is : " + kelvin);
		return kelvin;
	}
	static double myCelcius() {
		double fahrenheit, celcius;
		
		System.out.print("Enter a temperature for Fahrenheit : ");
		fahrenheit = in.nextDouble();
		celcius = (fahrenheit - 32) * 5/9;
		System.out.println("----------------------");
		System.out.println("Temperatrue for Celcius is : " + celcius);
		return celcius;
	}
	static double myFahrenheit() {
		double kelvin, fahrenheit;;
		
		System.out.print("Enter a temperature for Kelvin : ");
		kelvin = in.nextDouble();
		fahrenheit = (kelvin - 273.15) * 9/5 + 32;
		System.out.println("----------------------");
		System.out.println("Temperature for Fahrenheit is : " + fahrenheit);
		return fahrenheit;
	}

}
