package week8Examples;

public class returningMethodValues {

	public static void main(String[] args) {

		int num1 = 10;
		// int results;
				
		/* results = someNumbers(num1); // long way of accomplishing this
		System.out.println("The answer is: " + results); */
		
		System.out.println("The answer is: " + someNumbers(num1));
	}

	public static int someNumbers(int a) {
		int nums = a * 10;
		return nums;
	}
	
}
