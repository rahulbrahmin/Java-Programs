package string;

public class StringsIn2DMatrix {

	public static void main(String[] args) {
		String s = "GEEKS";
		char[][] mat = {
	            {'D','D','D','G','D','D'},
	            {'B','B','D','E','B','S'},
	            {'B','S','K','E','B','K'},
	            {'D','D','D','D','D','E'},
	            {'D','D','D','D','D','E'},
	            {'D','D','D','D','D','G'}
	           };
		
		
		int count = 0;
		
		for(int i=0 ; i<mat.length ; i++) {
			for(int j=0 ; j<mat[0].length ; j++) {
				count = fun(s , i , j , mat , 0);
			}
		}
		
		System.out.println(count);
	}
	
	static int fun(String s , int row , int col , char[][] mat , int ind) {
		int count = 0;
		
		if(row >=0 && col >=0 && row < mat.length && col < mat[0].length 
				&& s.charAt(ind) == mat[row][col]) {
			char temp = mat[row][col];
			mat[row][col] = 0;
			
			ind += 1;
			
			if(ind == s.length())
				count = 1;
			else {
				count += fun(s , row+1 , col , mat , ind);
				count += fun(s , row-1 , col , mat , ind);
				count += fun(s , row , col+1 , mat , ind);
				count += fun(s , row , col-1 , mat , ind);
			}
			
			// backtracking
			mat[row][col] = temp;
		}
		
		return count;
	}

}
