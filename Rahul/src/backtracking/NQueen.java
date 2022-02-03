package backtracking;

import java.util.Scanner;

public class NQueen {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			int a[][] = new int[n][n];
			
			for(int i=0 ; i<n ; i++) {
				for(int j=0 ; j<n ; j++)
					a[i][j] = 0;
			}
			
			if(nQueen(a , 0 , n)) {
				for(int i=0 ; i<n ; i++) {
					for(int j=0 ; j<n ; j++) {
						System.out.print(a[i][j] + " ");
					}
					System.out.println();
				}
			}
		}

	}
	
	static boolean isValid(int a[][] , int i , int j) {
		int n = a.length;
		
		// to check upside ki koi r queen to placed nhi h n?
		for(int x = 0 ; x < n ; x++) {     
			if(a[x][j] == 1)               // j constant hoga kyoki upr ja rhe h , x is row number.
				return false;
		}
		
		// Ab upr me dono side diagonally check krna h.
		//-----------------------------------------
		
		//for left diagonal
		//at current pos.
		int row = i;
		int col = j;
		
		while(row >= 0 && col >= 0) {
			if(a[row][col] == 1)
				return false;
			
			row--;           // upr left me ja rhe h diagonally to row km hoga
			col--;           // upr left me ja rhe h diagonally to column km hoga
		}
		
		//For above right diagonal.
		//at current position.
		row = i;
		col = j;
		
		while(row >= 0 && col < n) {
			if(a[row][col] == 1)
				return false;
			
			row--;      //upr right me ja rhe h diagonally to row km hoga
			col++;      //upr right me ja rhe h diagonally to column badhega.
		}
		
		return true;         // agr inme se koi  nhi h to
		
		//we didn't need to check in same column as we only have to put only one queen 
		//in each row.   we also didn't need to check below as we haven't reached yet.
	}
	
	
	static boolean nQueen(int a[][] , int i , int n ) {
//		int a[][] = new int[n][n];
		
		//we only need only one pointer let say row(i) as we didn't need to check in each 
		//in columns coz we'll jump to next row after placing our queen.
		
		if(i >= n)
			return true;
		
		for(int col=0 ; col<n ; col++) {
			if(isValid(a , i , col)) {     // if position is safe.
				a[i][col] = 1;
				
				
				// now check for next rows.
				if(nQueen(a , i+1 , n)) {
					return true;
				}
				
				a[i][col] = 0;    // backtracking.  agr any mila to vapas 0 kr do.
			}
		}
		
		return false; // if nothing satisfied return false;
	}

}
