package week10Examples;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myFirstJFRame extends JFrame {

	private JPanel contentPane;
	private JTextField txtWyatt;
	private JTextField txtDamon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myFirstJFRame frame = new myFirstJFRame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public myFirstJFRame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Wyatt Damon\\OneDrive\\Desktop\\UCCS Icon.png"));
		setTitle("myFirstUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 20, 88, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 55, 88, 31);
		contentPane.add(lblNewLabel_1);
		
		txtWyatt = new JTextField();
		txtWyatt.setText("Wyatt ");
		txtWyatt.setToolTipText("Enter your first name here");
		txtWyatt.setBounds(94, 25, 126, 19);
		contentPane.add(txtWyatt);
		txtWyatt.setColumns(10);
		
		txtDamon = new JTextField();
		txtDamon.setToolTipText("Enter last name here");
		txtDamon.setText("Damon");
		txtDamon.setBounds(94, 63, 126, 19);
		contentPane.add(txtDamon);
		txtDamon.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = fname.getText();
			
			}
			
		});
		btnNewButton.setBounds(260, 62, 85, 21);
		contentPane.add(btnNewButton);
	}
}
