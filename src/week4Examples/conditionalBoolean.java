package week4Examples;

import java.util.Scanner;

public class conditionalBoolean {

	public static void main(String[] args) {
		
		int number1;
		int number2;
		int number3;
		
		// CReate Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Get number 1 input
		System.out.println("what is number 1?");
		number1 = keyboard.nextInt();
		
		// Get number 2 input
		System.out.println("What is number 2?");
		number2 = keyboard.nextInt();
		
		// Get number 3 input
		System.out.println("What is number 3?");
		number3 = keyboard.nextInt();
		
		//Example of AND operator
		if (number1 < number2 && number1 < number3) {
			System.out.println("Smallest number is number1");
		}

		// Example of OR operator
		if (number1 > number2 || number3 > number2) {
			System.out.println("Number 3 is not the smallest");
			
		}
		
		keyboard.close();
	}

}
