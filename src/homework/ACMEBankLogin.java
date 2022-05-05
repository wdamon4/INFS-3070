package homework;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

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
		 JLabel j1, j2, j3;
	
		 HashMap<String, String> logininfo = new HashMap<String, String>();
		
		 ACMEBankLogin(HashMap<String, String> loginInforOriginal) {
			 
			 logininfo = loginInforOriginal;
	
			f = new JFrame ("ACME Bank Login");
			f.setLayout(null);
			f.setSize(400, 300);
			f.setBounds(100, 100, 435, 230);
			f.setResizable(false);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			j1 = new JLabel ("Username:", SwingConstants.LEFT);
			j1.setBounds(45, 30, 100, 20);
			g1 = new JTextField();
			g1.setBounds(140, 30, 120, 20);
			
			j2 = new JLabel ("PIN:", SwingConstants.LEFT);
			j2.setBounds(45, 90, 100, 20);
			k1 = new JPasswordField();
			k1.setBounds(140, 90, 120, 20);
			
			h1 = new JButton ("Submit");
			h1.setBounds(300, 60, 80, 20);
			h1.addActionListener(this);
			
			j3 = new JLabel ();
			j3.setBounds(110, 130, 300, 20);
			
			f.add(j1);
			f.add(g1);
			
			f.add(j2);
			f.add(k1);
			
			f.add(h1);
			f.add(j3);
			
			f.setVisible(true);
			
}

		@Override
		public void actionPerformed(ActionEvent e) {

			if(e.getSource() == h1) {
				
				String username = g1.getText();
				String password = String.valueOf(k1.getPassword());
				
				if(logininfo.containsKey(username)) {
					if(logininfo.get(username).equals(password)) {
						j3.setText("Login Successful!");
						j3.setForeground(Color.green);
						ACMEBank bankPage = new ACMEBank();
						
					}
					else {
						
						j3.setForeground(Color.red);
						j3.setText("Incorrect username/password");
					}
					
				}
				else {
					
					j3.setForeground(Color.red);
					j3.setText("Incorrect username/password");
			}
				
				
			
			}

		}
		
		public static void main(String[] args) {

			
			IDandPassword idandPasswords = new IDandPassword();
			
			ACMEBankLogin loginPage = new ACMEBankLogin(idandPasswords.getLoginInfo());
			
		}
			
		}
	

