package myExperiment;

import java.util.Scanner;
public class SecToMins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the estimated seconds : ");
		int num = in.nextInt();

		int min = (num / 60)%60;

		System.out.println("Minutes: " + min);
		in.close();
	}

}
