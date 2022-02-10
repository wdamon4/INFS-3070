package week4Examples;

import java.util.Scanner;

public class arrayLoopExamples {

	public static void main(String[] args) {
		
		final int employees = 3;
		
		Scanner keyboard = new Scanner(System.in);
		
		int[] hours = new int[employees];
		
		for (int counter = 0; counter < employees; counter ++) {
			System.out.println("Enter hours: " + (counter + 1));
			
			hours[counter] = keyboard.nextInt();
		}

		System.out.println("Hours entered for employee 2: " + hours [1]);
		
		keyboard.close();
	}

}
