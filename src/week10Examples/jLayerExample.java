package week10Examples;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class jLayerExample {

	public static void main(String[] args) {

		JLabel Label1 = new JLabel();
		Label1.setOpaque(true);
		Label1.setBackground(Color.GRAY);
		Label1.setBounds(25, 25, 250, 250);
		
		JLabel Label2 = new JLabel();
		Label2.setOpaque(true);
		Label2.setBackground(Color.BLUE);
		Label2.setBounds(50, 50, 250, 250);
		
		JLabel Label3 = new JLabel();
		Label3.setOpaque(true);
		Label3.setBackground(Color.CYAN);
		Label3.setBounds(75, 75, 250, 250);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		
		layeredPane.add(Label1, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(Label2, JLayeredPane.MODAL_LAYER);
		layeredPane.add(Label3, Integer.valueOf(3));
		
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
