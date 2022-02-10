package week4Examples;

import java.util.Arrays;

public class twoDArray {

	public static void main(String[] args) {
		
		// Arrays list style
		int [][] rent = {
				{400, 450, 510},
				{500, 560, 630},
				{625, 676, 740},
				{1000, 1250, 1600}
				};
		
		/* old fashioned way
		int [][] rent = new int [3][4];
		rent [0][0] = 400;
		rent [0][1] = 450;
		rent [0][2] = 510;
		rent [1][0] = 500;
		rent [1][1] = 560;
		rent [1][2] = 630;
		rent [2][0] = 625;
		rent [2][1] = 676;
		rent [2][2] = 740;
		rent [3][0] = 1000;
		rent [3][1] = 1250;
		rent [3][2] = 1600;
		*/
		
		/* get values from 2D array one at a time
		System.out.println("Rent is $" +rent[0][2] + " per month");
		*/
		
		// show all values in the array on a single line
		System.out.println(Arrays.deepToString(rent));
		
		
		
		}
		
	}
	

