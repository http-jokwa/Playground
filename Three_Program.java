
import java.util.Scanner;
public class Three_Program {

	static Scanner input = new Scanner(System.in);
	static int choice, num1;
	
	public static void FloydTriangle() {
		
		System.out.print("Enter a number to make triangle: ");
		num1 = input.nextInt();
		
		int val = 1;
		for(int i = 0; i<=num1; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print(val + " ");
				val++;
			}
			System.out.println();
		}
	}
	
	public static void OddEven() {
		
		System.out.print("Enter a number: ");
		num1 = input.nextInt();
		
		if (num1%2 == 0) {
			System.out.println("Even");
		}
		else if(num1%2 != 0) {
			System.out.println("Odd");
		}
	}
	
	public static void Random() {
		
		Random rand = new Random();
		int dice = rand.nextInt(6)+1;
		
		do {
			System.out.println("Guess the number from 1 - 6");
			System.out.println("Enter your guess number: ");
			num1 = input.nextInt();
			
			if (num1 == dice) {
				System.out.println("You are correct!");
				break;
			}
			else System.out.println("You are wrong!");
			continue;
		}
		while(num1 != dice);
		System.out.println("Program Ended!");
	}
	
	public static void main(String[] args) {
		int repeat;	
		do {
			System.out.println("""
					[1] Floyd Triangle
					[2] Odd or Even
					[3] Random Number
					[4] Exit
					""");
		System.out.print("Choose a program: ");
		choice = input.nextInt();
		System.out.println("---------------");
		switch (choice) {
		
		case 1:
			FloydTriangle();
			break;
		case 2:
			OddEven();
			break;
		case 3:
			Random();
			break;
		case 4: 
			System.out.println("Exit!");
			break;
		default:
			System.out.println("Error Input");
			break;
		}
		System.out.println("""
				\nDo you want to do it again?
				Press 1 if Yes
				Press 2 if No""");
		repeat = input.nextInt();
		}
		while(repeat == 1);
		System.out.println("Thank you!");
	}
}
