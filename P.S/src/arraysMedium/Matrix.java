package arraysMedium;

import java.util.Scanner;

/*  Create	an	N*M	matrix	and	take	input	from	the	user	to	populate	it	
and	then	print	the	matrix  */

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of row:  ");
		int n = sc.nextInt();
		
		System.out.println("Enter size of columns:  ");
		int m = sc.nextInt();
		
		int a[][] = new int[n][m];
		
		System.out.println("\nEnter n*m elements");
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<m ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nElements of matrix are:  ");
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<m ; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
