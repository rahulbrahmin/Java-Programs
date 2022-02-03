package recursionNew;

public class Suduko {

	public static void main(String[] args) {
		char c[][] = new char[9][9];
		
//		for(int i=0 ; i<9 ; i++) {
//			for(int j=0 ; j<9 ; j++)
//				c[i][j] = '.';
//		}
		
		suduko(c);
		display(c);
		
		Suduko s1 = new Suduko();
		s1.suduko(c);
		
	}
	
	static void suduko(char[][] c) {
		if(c == null || c.length == 0)
			return;
		
		solve(c);
		
		for(int i=0 ; i<c.length ; i++) {
			for(int j=0 ; j<c[0].length ; j++)
				System.out.print(c[i][j] + " ");
			
			System.out.println();
		}
	}
	
	static void display(char[][] a) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[0].length ; j++)
				System.out.print(a[i][j] + " ");
			
			System.out.println();
		}
	}
	
	static boolean solve(char a[][]) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[0].length ; j++) {
				
				// if thet index is empty
				if(a[i][j] == '.') {
					for(char c = '1' ; c <= '9' ; c++) {
						// if this character is valid insert it
						if(isValid(a , i , j , c))
							a[i][j] = c;
						
						// if function works fine return true
						if(solve(a))
							return true;
						
						// else add .
						else
							a[i][j] = '.';
					}
				}
				
				// if index has some other value simply return false
				return false;
			}
		}
		
		// if all indexes are full return true
		return true;
	}
	
	static boolean isValid(char[][] a , int row , int col , char c) {
		for(int i=0 ; i<a.length ; i++) {
			
			// if c is already present somewhere in row return false
			if(a[i][col] == c)
				return false;
			
			// similarly if it is already somewhere present in column return false
			if(a[row][i] == c)
				return false;
			
			// for matrix of (3*3)
			if(a[3 * (row/3) + i/3][3 * (col/3) + i%3] == c)
				return false;
		}
		
		// if it is not present anywhere return true.
		return true;
	}
}
