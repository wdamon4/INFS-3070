package week3Examples;

public class ifElseExample {

	public static void main(String[] args) {
		
		int score = 6;
		
		if (score == 6) {
			System.out.println("A touchdown was scored");	
		} else if (score == 3) {
			System.out.println("This could be a field goal");
		} else if (score < 3) {
			System.out.println("This i probably a safety");
		} else {
			System.out.println("I have no idea what you're doing");
		}
	}

}

