package week8Examples;

public class localVariables {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		int results1;
		int results2;
		
		results1 = someNumbers(num1);
		System.out.println("The answer is: " + results1);
		
		results2 = addingNums(num1, num2);
		System.out.println("Adding both equals: " + results2);
	}

	public static int someNumbers(int a) {
		int nums = a*8;
		return nums;
	}
	
	
	public static int addingNums(int a, int b) {
		int nums = a+b;
		return nums;
	}
}
