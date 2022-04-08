package exam2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class makeCoffee {

	private static JLabel noOfCoffee;
	private static JButton coffeeButton;
	
	private static int count = 0;
	
	public static void main(String[] args) {

		createWindow();
		
		coffeeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(count==10) {
					createFile();
				}
				
				noOfCoffee.setText(String.valueOf(++count));
				
			}
		});
		
	}

	protected static void createFile() {
		// Making my coupon.txt file
		
		try {
			
			File myFile = new File("coupon.txt");
			if(myFile.createNewFile()) {
				System.out.println("File Created: " + myFile.getName());
			}
			
			else {
				System.out.println("File Already Created");
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		//Creating the "free coffee" message and writting it to the file 
		try {
			FileWriter writer = new FileWriter("coupon.txt");
			writer.write("CONGRATULATIONS!" + "\n");
			writer.write("With the purchase of your tenth coffee you have earned a free coffee!");
			writer.close();
			System.out.println("File Written");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	private static void createWindow() {
		// Adding J Frame Specifications
		
		JFrame frame = new JFrame("Red Devil Coffee Rewards");
		createUI(frame);
		ImageIcon icon = new ImageIcon("coffee.png");
		frame.setIconImage(icon.getImage());
		frame.setSize(365, 185);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

	private static void createUI(JFrame frame) {
		
		coffeeButton = new JButton("Buy Coffee");
		coffeeButton.setBounds(120, 50, 115, 25);
		coffeeButton.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel coffee_label = new JLabel("Number of Coffees: ");
		coffee_label.setBounds(110, 80, 150, 30);
		
		noOfCoffee = new JLabel("0");
		noOfCoffee.setBounds(230, 80, 150, 30);
		
		JLabel label = new JLabel("");
		
		frame.add(coffeeButton);
		frame.add(coffee_label);
		frame.add(noOfCoffee);
		frame.add(label);
		
	}

}
