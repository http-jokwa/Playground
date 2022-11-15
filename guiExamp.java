package myExperiment;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class guiExamp {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Hello");
		JLabel tlabel,tlabel1, tlabel2, tlabel3, fr, msg;
		JTextField t1, n1, n2, n3, em, p1, p2;
		JButton b1, b2;
		JPasswordField p;
		JCheckBox m,f;
		
		//Label
		tlabel = new JLabel("BrazzerHood PH");
		tlabel.setFont(new Font("Courier", Font.BOLD, 24));
		tlabel.setBounds(147, 30, 200, 60);
		tlabel.setVisible(true);
		tlabel.setLayout(null);
		tlabel.setForeground(Color.orange);
		
		//Label1 user
		tlabel1 = new JLabel("Username:");
		tlabel1.setBounds(60, 100, 100, 60);
		tlabel1.setVisible(true);
		tlabel1.setForeground(Color.white);
		tlabel1.setLayout(null);
		
		
		//Label2 pass
		tlabel2 = new JLabel("Password:");
		tlabel2.setBounds(60, 140, 100, 60);
		tlabel2.setLayout(null);
		tlabel2.setVisible(true);
		tlabel2.setForeground(Color.white);
		
		//field user
		t1 = new JTextField("");
		t1.setVisible(true);
		t1.setLayout(null);
		t1.setBounds(160, 120, 175, 20);
		
		//field pass
		p = new JPasswordField();
		p.setVisible(true);
		p.setLayout(null);
		p.setBounds(160, 160, 175, 20);
		
		//Login Button
		b1 = new JButton("Login");
		b1.setLayout(null);
		b1.setVisible(true);
		b1.setBounds(235, 200, 100, 20);
		b1.setForeground(Color.black);
		b1.setBackground(Color.orange);
		
		
		// signup label
		tlabel3 = new JLabel("Create an Account");
		tlabel3.setVisible(true);
		tlabel3.setForeground(Color.white);
		tlabel3.setFont(new Font("Courier", Font.BOLD,24));
		tlabel3.setLayout(null);
		tlabel3.setBounds(135, 295, 240, 30);
		
		// name fied
		n1 = new JTextField("First Name");
		n1.setLayout(null);
		n1.setVisible(true);
		n1.setBounds(30, 350, 130, 20);
		
		// last name
		n2 = new JTextField("Last Name");
		n2.setLayout(null);
		n2.setVisible(true);
		n2.setBounds(180, 350, 130, 20);
		
		//middle name
		n3 = new JTextField("Username");
		n3.setVisible(true);
		n3.setLayout(null);
		n3.setBounds(330, 350, 130, 20);
		
		//email
		em = new JTextField("Email or mobile number");
		em.setVisible(true);
		em.setLayout(null);
		em.setBounds(30,385, 200, 20);
		
		// male
		m = new JCheckBox("Male");
		m.setVisible(true);
		m.setLayout(null);
		m.setBounds(250, 385, 100, 20);
		m.setBackground(Color.black);
		m.setForeground(Color.white);
		
		// female
		f = new JCheckBox("Female");
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(350, 385, 100, 20);
		f.setBackground(Color.BLACK);
		f.setForeground(Color.white);
		
		//password 1
		p1 = new JTextField("Enter your password");
		p1.setVisible(true);
		p1.setLayout(null);
		p1.setBounds(30, 420, 200, 20);
		
		//re pass
		p2 = new JTextField("Re-enter your password");
		p2.setVisible(true);
		p2.setLayout(null);
		p2.setBounds(30, 460, 200, 20);
		
		//sign up button
		b2 = new JButton("Sign Up");
		b2.setLayout(null);
		b2.setVisible(true);
		b2.setBounds(45, 520, 160, 30);
		b2.setBackground(Color.orange);
		b2.setForeground(Color.black);
		
		//forgot
		fr = new JLabel("Forgot password");
		fr.setVisible(true);
		fr.setLayout(null);
		fr.setBounds(233, 230, 120, 20);
		fr.setFont(new Font("Courier", Font.ITALIC, 11));
		fr.setForeground(Color.white);
		
		
		// frame mssg
		msg = new JLabel("I love you bb ko balik ka na miss na miss na kita");
		msg.setLayout(null);
		msg.setVisible(true);
		msg.setBounds(10, 620, 400, 20);
		msg.setForeground(Color.orange);
		msg.setFont(new Font("Courier", Font.ROMAN_BASELINE, 12));
		
		
		//Frame Title
		frame.setVisible(true);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 650);
		frame.add(tlabel);
		frame.add(tlabel1);
		frame.add(tlabel2);
		frame.add(tlabel3);
		frame.add(t1);
		frame.add(p);
		frame.add(b1);
		frame.add(n1);
		frame.add(n2);
		frame.add(n3);
		frame.add(em);
		frame.add(m);
		frame.add(f);
		frame.add(p1);
		frame.add(p2);
		frame.add(b2);
		frame.add(fr);
		frame.add(msg);
		
	}

}
