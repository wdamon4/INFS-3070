package homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

// Adding in Acction Listener
public class ACMEBank implements ActionListener {

	// Creating variables for the window 
	JFrame a;
	JTextField b1, b2, b3;
	JButton c1, c2, c3;
	JLabel d1, d2, d3, d4;
	double balance = 0;
	
	ACMEBank() {
		
		balance = 0.0;
		a = new JFrame ("ACME Bank");
		
		// labeling and creating first line of window
		d1 = new JLabel ("DEPOSIT", SwingConstants.RIGHT);
		d1.setBounds(30, 30, 90, 20);
		d1.setAlignmentX(100);
		b1 = new JTextField();
		b1.setBounds(140, 30, 120, 20);
		c1 = new JButton ("CREDIT");
		c1.setBounds(270, 30, 80, 20);
		
		// labeling and creating second line of window
		d2 =new JLabel ("WITHDRAWAL", SwingConstants.RIGHT);
		d2.setBounds(21, 80, 100, 20);
		b2 = new JTextField();
		b2.setBounds(140, 80, 120, 20);
		c2 = new JButton ("DEBIT");
		c2.setBounds(270, 80, 80, 20);
		
		// creating CLEAR button
		c3 = new JButton ("CLEAR");
		c3.setBounds(360, 55, 80, 20);
		
		// Labeling and creating last line of window
		d3 = new JLabel ("BALANCE", SwingConstants.RIGHT);
		d3.setBounds(-21, 130, 140, 20);
		d4 = new JLabel ("$ " + balance);
		d4.setBounds(138, 130, 150, 20);
		
		// adding action listener
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		
		// adding first line items to window 
		a.add(d1);
		a.add(b1);
		a.add(c1);
		
		// adding second line items to window 
		a.add(d2);
		a.add(b2);
		a.add(c2);
		
		// adding CLEAR button and final line items to window
		a.add(c3);
		a.add(d3);
		a.add(d4);
		
		// creating bounds of the window
		a.setLayout(null);
		a.setSize(400, 400);
		a.setBounds(100, 100, 470, 300);
		a.setVisible(true);
		a.setResizable(false);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == c1) {
	
			// get deposit amount and add to balance
		try {
			double amount = Double.parseDouble(b1.getText());
			balance += amount;
			d4.setText("$ " + balance);
		
		} catch (NumberFormatException ee) {
			JOptionPane.showMessageDialog(a, "Invalid entry");
		}
		
		// get withdrawal amount and subract from balance 
	} else if (e.getSource() == c2) {
		try {
			
			double amount = Double.parseDouble(b2.getText());
			
			balance -= amount;
			d4.setText("$ " + balance);
			
		} catch (NumberFormatException ee) {
			JOptionPane.showMessageDialog(a, "Invalid Entry");
		}
	} else if (e.getSource() == c3) {
		b1.setText("");
		b2.setText("");
		
		}
	}
	
	public static void main(String[] args) {

		new ACMEBank();
	
	}
}
