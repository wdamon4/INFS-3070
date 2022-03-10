package homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ItsMe {

	public static void main(String[] args) {
		
		// Creating 3 string variables with my information
		String studentName = "Wyatt Damon";
		String studentMajor = "Business Marketing major with an INFS minor";
		String studentBirthPlace = "Fort Collins, CO"; 
		
		// Creating two variables to multiply together 
		int variable1 = 5 ;
		int variable2 = 8 ; 
		
		//Created BufferedWriter and FileWriter classes plus my try statement
			try {
				BufferedWriter fileWriting = new 
		BufferedWriter (new FileWriter ("MyInfo.txt"));
				
		// Adding Data to the file
				fileWriting.write("My name is " + studentName + "\n" + "I am a " + studentMajor + "\n" + "I was born in " + studentBirthPlace);
				fileWriting.write("\n" + variable1 * variable2);
				
		// Closing the File
				fileWriting.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

}
