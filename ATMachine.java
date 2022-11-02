import java.util.*;

import javax.swing.JOptionPane;
public class ATMachine {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {

		int balance = 50000;
		JOptionPane.showMessageDialog(null, "Hello User!");
		String pins1 = JOptionPane.showInputDialog("Enter your 4-digit PIN: ");
		int pins = Integer.parseInt(pins1);
		
		if (pins == 7290) {
			JOptionPane.showMessageDialog(null, "Log in Successfuly!");
			JOptionPane.showMessageDialog(null, "1. Balance\n" + "2. Withdraw\n" + "3. Depsoit\n");
			String choice = JOptionPane.showInputDialog(null, "Enter your choices:");
			int dig = Integer.parseInt(choice);
			
			if(dig == 1) {
				JOptionPane.showMessageDialog(null, "Your current balance is " + balance + " pesos.");
				
			}
			else if(dig == 2) {
				String withdraw = JOptionPane.showInputDialog(null, "Enter the amount to withdraw:");
				int amount = Integer.parseInt(withdraw);
				JOptionPane.showConfirmDialog(null, "Are you sure about this?");
				JOptionPane.showMessageDialog(null, "You withdraw " + amount + " pesos.\n" +
				" Total amount " + (balance - amount));
			}
			else if (dig == 3) {
				String dep = JOptionPane.showInputDialog(null, "Enter the amount to deposit:");
				int amount2 = Integer.parseInt(dep);
				JOptionPane.showConfirmDialog(null, "Are you sure about this?");
				JOptionPane.showMessageDialog(null, "You deposit " + amount2 + " pesos.\n" +
				" Total amount " + (balance + amount2));
			}
			else {
				JOptionPane.showMessageDialog(null, "Error input");
			}
		}
		
		else
	
			JOptionPane.showMessageDialog(null, "Error PIN Login!");
		
		System.exit(0);
		
	}
}
