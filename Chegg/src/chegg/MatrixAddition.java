package chegg;

import java.util.Random;

public class MatrixAddition {

	public static void main(String[] args) {
		//Creating object of Random class to get random numbers.
		Random random = new Random();
		
		//Creating row of matrix randomly between (5 to 10)
		int r = 5 + random.nextInt((10 - 5) + 1);
		
		//Creating column of matrix randomly between (2 to 10)
		int c = 2 + random.nextInt((10 - 2) + 1);
		
		//Creating 2D array of randomly generated row and column
		int a[][] = new int[r][c];
		
		for(int i=0 ; i<r ; i++) {
			for(int j=0 ; j<c ; j++) {
				//Filling random values in our array between (11 to 99)
				a[i][j] = 11 + random.nextInt((99 - 11) + 1);
			}
		}
		
		System.out.println("Our random 2D array is:-  ");
		System.out.println("-------------------------");
		
		//Displaying our random created 2D array
		for(int i=0 ; i<r ; i++) {
			for(int j=0 ;j<c ; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nSum of elements of columns of given matrix:  ");
		System.out.println("-------------------------------------------");
		
		//Calculating column wise sum of our random 2D array
		for(int i=0 ; i<c ; i++) {
			int sum = 0;
			for(int j=0 ; j<r ; j++) {
				sum += a[j][i];
			}
			System.out.println("Column " + (i+1) + ":- " + sum);
		}
	}

}
