package homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class homeWork4 {

	public static void main(String[] args) throws IOException {

		// create string variables 
		String names ="";
		int ages;
		String answer ="";
		
		// bring in scanner utility to enter answers
		Scanner sc = new Scanner(System.in); 

		// link the hash map
		LinkedHashMap<String,Integer> records = new LinkedHashMap<String,Integer>();
		
		// prompt console for user data	
		while(true) {
				System.out.println("What is your name?");
				names = sc.next();
			
				System.out.println("What is your age?");
				ages = sc.nextInt();
				
				System.out.println("Would you like to add another record? (yes/no)");
				answer = sc.next();
				
				System.out.println();
				if(answer.equals("no")); {
					break;
				}
			}
			
		// Printing the records in the map
		for(Map.Entry<String, Integer> m1:records.entrySet()) {
			System.out.println(m1.getKey()+ "" + m1.getValue());
		}
		
		System.out.println();
		String ch="";
		String fil="";
		System.out.println("Would you like to write to a file? (yes/no)"); 
		ch = sc.next();
		if(ch.equals("yes"));{
			System.out.println();
			System.out.println("Enter the file name"); //prompting user to enter file name
			fil = sc.next();
			BufferedWriter b=new BufferedWriter(new FileWriter(fil));
			for(Map.Entry<String, Integer> m1:records.entrySet()) {
				b.write(m1.getKey()+ " " +m1.getValue()); //writing into the file 
				b.newLine();
			}
		}
			System.out.println("Thanks for playing!"); //closing statement
		}
	}
	
	

