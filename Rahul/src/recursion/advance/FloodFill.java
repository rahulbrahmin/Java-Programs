package recursion.advance;

public class FloodFill {

	public static void main(String[] args) {
		int a[][] = {
				{1 , 1 , 1 , 2 , 1 , 1 , 1},
				{2 , 2 , 1 , 2 , 2 , 1 , 1},
				{0 , 2 , 2 , 2 , 1 , 1 , 1},
				{1 , 1 , 0 , 2 , 1 , 2 , 2},
				{1 , 1 , 2 , 2 , 1 , 0 , 0}
		};
		
		printMatrix(a);
		System.out.println();
		
		floodFill(a , 2 , 3 , 3 , 2);
		
		printMatrix(a);
		
        floodFill(a , 1 , 5 , 5 , 1);
		
        System.out.println();
		printMatrix(a);

	}
	
	static void floodFill(int a[][] , int r , int c , int toFill , int prevFill) {
		int rows = a.length;
		int cols = a[0].length;
		
		if(r<0 || r>=rows || c<0 || c>=cols)     // agr matrix se bahar h to exit
			return;
		
		if(a[r][c] != prevFill)               // jha fill krna h vha purana value hi h n
			return ;
		
		a[r][c] = toFill;                   // fill krdo simply
		
		floodFill(a , r-1 , c , toFill , prevFill);
		floodFill(a , r , c-1 , toFill , prevFill);
		floodFill(a , r+1 , c , toFill , prevFill);
		floodFill(a , r , c+1 , toFill , prevFill);
	}
	
	static void printMatrix(int a[][]) {
		int r = a.length;
		int c = a[0].length;
		
		for(int i=0 ; i<r ; i++) {
			for(int j=0 ; j<c ; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
//			System.out.println();
		}
	}
}
