
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("CALCULATOR\n");
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multipication");
		System.out.println("Press 4 for Division");
		System.out.println("Press 5 for Modulo");
		System.out.println("\n");
		
		System.out.print("Enter the operation to be use: ");
		int operation = in.nextInt();
		System.out.print("Enter your 1st number: ");
		int num1 = in.nextInt();
		System.out.print("Enter your 2nd number: ");
		int num2 = in.nextInt();
		System.out.println("Do you want to do it again? Y/N: ");
		boolean repeat1 = in.nextBoolean();
		
		do {
			System.out.print("Enter the operation to be use: ");
			operation = in.nextInt();
			System.out.print("Enter your 1st number: ");
			num1 = in.nextInt();
			System.out.print("Enter your 2nd number: ");
			num2 = in.nextInt();
			
			if (operation == 1) {
				int sum = num1+num2;
				System.out.println("Result: " + sum);
			}
			else if (operation == 2) {
				int diff = num1-num2;
				System.out.println("Result: " + diff);
			}
			else if (operation == 3) {
				int mul = num1*num2;
				System.out.println("Result: " + mul);
				
			}
			else if(operation == 4) {
				int div = num1/num2;
				System.out.println("Result: "+div);
			}
			else if(operation == 5) {
				int rem = num1%num2;
				System.out.println(rem);
			}
		}
		while(repeat1 == true);
		
		if (repeat1 != true) {
			System.out.println("Finished");
		}
		
		in.close();
	}

}
