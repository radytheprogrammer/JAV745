package somayeh;

import java.util.Random;

public class ProductOfNumbersInArray {
	final static int UPPER_LIMIT = 5;
	final int LOWER_LIMIT = 1;
	
	
	public static void main(String[] args) {
		// define the range
		int max = 3;
		int min = 1;
		int range = max - min + 1;
		// define array
		int [] sample1 = {1, -2, -3, 5};
		int [] sample2 = {1, 2, 3, -5};
		int [] sample3 = {1, 2, 0, -5};
		double [][] randomArray = new double[max][max]; // [0][0] - [1][1]
		
		int retValue = 0;
		
		System.out.println("Size of randomArray: " + randomArray.length);
		
		retValue = solution(sample1);
		System.out.println("Function solution called with {1, -2, -3, 5} returns a value of: " + retValue);
		
		retValue = solution(sample2);
		System.out.println("Function solution called with {1, 2, 3, 5} returns a value of: " + retValue);
		
		retValue = solution(sample3);
		System.out.println("Function solution called with {1, 2, 3, 5} returns a value of: " + retValue);
		
		System.out.println("Random value of type int between "+min+" to "+max+ ":");
		double randomNum = (int) (Math.random() * (max - min) + min);
		System.out.println("Random value:" + randomNum);
		
		// populate array with random number
		for( int j = 1; j < max; j++ ) {
			for(int k = 1; k < max; k++  ) {
//				System.out.printf("[%d][%d]\n", j, k);
				randomArray[j][k] = (double) (Math.random() * max );
			}
		}
		// print array
		for( int i = 0; i < max; i++ ) { // human readable
			for(int j = 0; j < max; j++ )
				System.out.printf("[%d][%d]: %.2f\n", i, j, randomArray[i][j]);
		}
		
	}
	
	public static int solution(int[] array) {
		int result = 0; //initialize to 0, also case if product is 0;
		int product = 1;
		for (int a : array) { 
		    product *= a;
		}
		if(product > 0) {
			result = 1; // Happy path, everything works as intended
		} else if( product < 0 ){
			result = -1; // product is negative number
		} else {
			result = 0;
		}
		return result;
	}

}