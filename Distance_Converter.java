import java.util.Scanner;
public class DistanceConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double nm, mi, km;
		
		System.out.print("Enter a value for nautical : ");
		nm = in.nextDouble();
		
		km = 1.852 * nm;
		
		mi = km / 1.609;

		System.out.println("The " + nm + " nautical mile/s is equal to " + km + " km"); // kilometer
		System.out.println("The " + nm + " nautical miles/s is equal to " + mi + " mile/s"); //miles
		in.close();
		
	}

}
