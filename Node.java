
import java.util.Scanner;
public class Node {

	public int data;
	public Node next;
	public static Node fNode;
	public static Node lNode = null;
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int numnodes, num;
		
		System.out.print("Number of inputs: ");
		numnodes = input.nextInt();
		
		for(int i = 0; i<numnodes; i++) {
			System.out.print("Enter a number: ");
			num = input.nextInt();
			
			Node n = new Node(num,null);
			
		if(lNode != null) {
			
			lNode.next = n;
			lNode = n;
		}
		else {
			fNode = n;
			lNode = n;
		}
	  }
	
		System.out.print("Printing the inputs: ");
		Node n = fNode;
		while(n != null) {
			System.out.print(n.data + "\t");
			n = n.next;
		}
		System.out.println();
	}
}
