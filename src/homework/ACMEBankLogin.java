package homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ACMEBankLogin implements ActionListener {

		// Creating variables for the window
		JFrame f;
		JTextField g1;
		JPasswordField k1;
		JButton h1;
		JLabel j1, j2;
	
		ACMEBankLogin() {
	
			f = new JFrame ("ACME Bank Login");
			f.setLayout(null);
			f.setSize(400, 300);
			f.setBounds(100, 100, 435, 230);
			f.setVisible(true);
			f.setResizable(false);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			j1 = new JLabel ("Username", SwingConstants.RIGHT);
			j1.setBounds(120, 60, 100, 20);
			g1 = new JTextField();
			g1.setBounds(140, 60, 120, 20);
			
			j2 = new JLabel ("PIN", SwingConstants.RIGHT);
			j2.setBounds(120, 120, 100, 20);
			k1 = new JPasswordField();
			k1.setBounds(140, 120, 120, 20);
			
			h1 = new JButton ("Submit");
			h1.setBounds(300, 90, 80, 20);
			h1.addActionListener(this);
			
			f.add(j1);
			f.add(g1);
			
			f.add(j2);
			f.add(k1);
			
			f.add(h1);
}

		@Override
		public void actionPerformed(ActionEvent e) {

		
		
	}

		public static void main(String[] args) {

			new ACMEBankLogin();
	
	}
			
}
	

