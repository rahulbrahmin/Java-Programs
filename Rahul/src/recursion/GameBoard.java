package recursion;

public class GameBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gameBoard(0 , 3));
	}
	
	static int gameBoard(int s , int e) {
		if(s == e)
			return 1;
		
		if(s > e)
			return 0;
		
		int count = 0;
		
		for(int i=1 ; i<=6 ; i++) {                  // coz it is decided by dice
			count += gameBoard(s+i , e);
		}
		
		return count;
	}

}
