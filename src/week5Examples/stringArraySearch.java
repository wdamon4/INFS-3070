package week5Examples;

import java.util.ArrayList;
import java.util.Scanner;

public class stringArraySearch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String Search;
		
		ArrayList<String> people = new ArrayList<>();
		
		people.add("Bob");
		people.add("Mary");
		people.add("Fred");
		people.add("Sarah");
		people.add("Frank");
		
		System.out.println("What would you life to search for? ");
		Search = scanner.nextLine();
		
		System.out.println("What I found: ");
		
		for(String element:people) {
			if(element.contains(Search)) {
				System.out.println(element);
			}
		}

		scanner.close();
		
	}

}
