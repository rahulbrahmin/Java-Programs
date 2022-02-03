package twoDArray;

public class Rotate90Degree {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
		
		display(arr);
		
		// taking transpose first;
		transpose(arr);
		
		System.out.println("\nTranspose of above matrix:  ");
		display(arr);
		
		// now reversing columns , so that matrix get rotated by 90 degree.
		reverseColumns(arr);
		
		System.out.println("\nMatrix rotated by 90 degrees");
		display(arr);
	}
	
	static void transpose(int a[][]) {
		for(int i=0 ; i<a.length ; i++) {
			
			// iteration only in upper triangular to avoid double swapping.
			for(int j=i ; j<a[0].length ; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
	}
	
	// reversing columns row by row
	static void reverseColumns(int a[][]) {
		
		for(int i=0 ; i<a.length ; i++) {
			
			// swapping row by row
			int l = 0;
			int r = a[i].length - 1;
			
			while(l<r) {
				int temp = a[i][l];
				a[i][l] = a[i][r];
				a[i][r] = temp;
				
				l++;
				r--;
			}
		}
	}
	
	static void display(int a[][]) {
		
		// for row
		for(int i=0 ; i<a.length ; i++) {
			
			// for column
			for(int j=0 ; j<a[0].length ; j++) {
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
