import java.util.Scanner;
import java.util.Random;
public class Prediction {
static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
	
		Random rand = new Random();
		int dice = rand.nextInt(10) +1;
		int predict;
		int x=1;
		
		System.out.println("Can you predict the number?\n");
		System.out.println("Prize: 20 pesos per correct answer\n");
		
		do {
			myUser();
			System.out.print(x +". Enter your predict number : ");
			predict = in.nextInt();
			x++;
			if (predict == dice) {
				System.out.println("CONGRATULATIONS! You got it right!\n");
				break;
			}
			else {
				System.out.println("Wrong prediction T_T\n");
			}
			
		}
		while (predict!=dice);
		in.close();
		
		
	}
	public static void myUser() {
		
		System.out.print("Enter your username : ");
		String user = in.nextLine();
		System.out.println("Hi " + user + "!");
	}

}
