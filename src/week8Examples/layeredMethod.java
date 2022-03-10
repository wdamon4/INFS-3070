package week8Examples;

public class layeredMethod {

	public static void main(String[] args) {

		System.out.println("I am starting in Main Method");
		deep();
		System.out.println("Now i am back in Main");
		
	}

	public static void deep() {
		System.out.println("I am now in deep");
		deeper();
		System.out.println("Now i am back in deep");
		
	}
	
	public static void deeper() {
		System.out.println("I am now in deeper");
	}
	
}
