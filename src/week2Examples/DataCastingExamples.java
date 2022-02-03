package week2Examples;

public class DataCastingExamples {

	public static void main(String[] args) {
		
		/* Casting a smaller data type to a larger data type
		 * 
		int wyattsAccount = 10;
		double wyattsDouble = wyattsAccount;
				
				System.out.println(wyattsAccount);
				System.out.println(wyattsDouble);
		*/
		
		double wyattsAccount = 10.55;
		int wyattsInt = (int)wyattsAccount;  // Casting in this direction must be done manually 
		
		System.out.println(wyattsAccount);
		System.out.println(wyattsInt);
	}

}
