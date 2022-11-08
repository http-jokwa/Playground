package myExperiment;
import java.util.*;
import javax.swing.*;
public class PayCheckCalculator {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	String name = JOptionPane.showInputDialog("Enter Employee Name: ");
	
	String userinput = JOptionPane.showInputDialog("Enter Gross Amount: ");
	double amount = Double.parseDouble(userinput);
	
	double InTax = amount * 0.20D,
			GSIS = amount * 0.05D,
			PhilH = amount * 0.0275D,
			Pagibig = amount * 0.015D,
			SalLoan = amount * 0.25D,
			Insur = amount * 0.325D,
			Npay =  amount - (InTax + GSIS + PhilH + Pagibig + SalLoan + Insur);
			
	JOptionPane.showMessageDialog(null, name + "\n"+"Deduction: \n" + 
			"Income Tax:    " + InTax + " pesos\n" +
			"GSIS:    " + GSIS + " pesos\n" + 
			"Phil Health:    " + PhilH + " pesos\n" + 
			"Pag-ibig:    " + Pagibig + " pesos\n" + 
			"Salary Loan:    " + SalLoan + " pesos\n" + 
			"Insurance:    " + Insur + " pesos\n" +
			"NetPay:    " +Npay);
	      
	}

}
