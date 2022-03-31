package week10Examples;

import java.awt.Color;

import javax.swing.JFrame;

public class jFrameExample {

	public static void main(String[] args) {

		// Creating a frame
		JFrame frame = new JFrame();
		
		//Makes frame visible on screen 
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setTitle("Mt first UI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		frame.getContentPane().setBackground(new Color(0xCAF4DF));
				
	}

}
