package week5Examples;

public class countDownForLoop {

	public static void main(String[] args) {
		
		// Can use a scanner to decide how much time to count down from 
		int timer = 10;
		
		for (int i = timer; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("Kaboom!");
		
	}

}
