package week5Examples;

public class arraySortingExample {

	public static void main(String[] args) {
	
		int[] grades = {87, 76, 98, 100, 56};
		
		int temp;
		
		for(int i=0; i<grades.length; i++) {
			for(int j=1; j<grades.length; j++) {
				if(grades[i] > grades[j]) {
					temp = grades[i];
					grades[i] = grades[j];
					grades[j] = temp;
				}
			}
		}

		for(int a:grades) {
			System.out.println(a);
		}
		
	}

}
