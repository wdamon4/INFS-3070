package week4Examples;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> gradeList = new ArrayList<>();
		
		gradeList.add("97");
		gradeList.add("84");
		gradeList.add("100");
		gradeList.add("66");
		gradeList.add("77");
		
		// gradeList.remove(1);
		
		// Test re-take to change grade
		gradeList.set(3, "99");
		
		System.out.println(gradeList);
		

	}

}
