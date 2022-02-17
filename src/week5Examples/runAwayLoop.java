package week5Examples;

public class runAwayLoop {

	public static void main(String[] args) {
		
		while(1==1) {
			System.out.println("Help I'm stuck in a loop!");
			
			// Break is used to stop runaway loops
			break;
		}

	}

}
