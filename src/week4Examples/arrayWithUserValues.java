package week4Examples;

import java.util.Scanner;

public class arrayWithUserValues {

	public static void main(String[] args) {
		
		final int employees = 3; // Initial number of employees
		int[] hours = new int[employees]; // Defining new array
		
		//Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter hours worked by " + employees + " employees.");
		
		// Employee 1 hours
		System.out.println("Employee 1: ");
		hours[0] = keyboard.nextInt();
		
		// Employee 2 Hours
		System.out.println("Employee 2: ");
		hours[1] = keyboard.nextInt();
		
		// Employee 3 hours
		System.out.println("Employee 3: ");
		hours[2] = keyboard.nextInt();
		
		// Display hours entered
		System.out.println("The hours you entered are: ");
		System.out.println(hours[0]);
		System.out.println(hours[1]);
		System.out.println(hours[2]);
		
		keyboard.close();
	}

}
