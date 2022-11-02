public class Swap {
	
	public static void main(String[] args) {

		int x = 10, y = 20, z;
		
		System.out.println("Before swapping");
		System.out.println("x is " + x);    // x is 10
		System.out.println("y is " + y);    // y is 20
		System.out.println();
		
		z = x;
		x = y;
    
		System.out.println("After swapping");
		System.out.println("x is " + x);    // x is 20
		System.out.println("y is " + z);    // y is 10
		
		}
}
