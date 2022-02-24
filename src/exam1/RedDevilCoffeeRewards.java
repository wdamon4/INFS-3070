package exam1;

import java.util.Scanner;

public class RedDevilCoffeeRewards {

	public static void main(String[] args) {
		
		int beverages;
		
		// Created Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
		// Get Information from the user
		System.out.println("How many beverages did you purchase last week?");
		beverages = keyboard.nextInt();
		
		// Determine how many rewards points the user earned
		if (beverages == 1) {
			System.out.println("You have earned 5 points");
		} else if (beverages == 2) {
			System.out.println("You have earned 15 points");
		} else if (beverages == 3) {
			System.out.println("You have earned 30 points");
		} else if (beverages > 3) {
			System.out.println("You have earned " + (30 + ((beverages - 3) * 20)) + " points");
		}

		keyboard.close();
		
	}

}
