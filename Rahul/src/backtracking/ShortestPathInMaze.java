/* We can only travel on path where 1 is present */

package backtracking;

public class ShortestPathInMaze {

	public static void main(String[] args) {
		int a[][] = {
				{1,1,1,1,1,0,0,1,1,1},
				{0,1,1,1,1,1,0,1,0,1},
				{0,0,1,0,1,1,1,0,0,1},
				{1,0,1,1,1,0,1,1,0,1},
				{0,0,0,1,0,0,0,1,0,1},
				{1,0,1,1,1,0,0,1,1,0},
				{0,0,0,0,1,0,0,1,0,1},
				{0,1,1,1,1,1,1,1,0,0},
				{1,1,1,1,1,0,0,1,1,1},
				{0,0,1,0,0,1,1,0,0,1},
		};
		
		int result = shortestPath(a , 0 , 0 , 8 , 0);
		
		if(result >= 10000) {
			System.out.println("No path possible");
		}else {
			System.out.println(result);
		}
	}
	
	static int shortestPath(int a[][] , int i , int j , int x , int y) {
		int rows = a.length; 
		int cols = a[0].length;
		
		boolean vis[][] = new boolean[rows][cols];
		
		return shortestPath(a , i , j , x , y , vis);
	}
	
	//helper function
	static boolean isValid(int a[][] , int i , int j , boolean vis[][]) {
		int rows = a.length;
		int cols = a[0].length;
		
		return (i>=0 && j>=0 && i<rows && j<cols && a[i][j] == 1 && !vis[i][j]);
	}
	
	static int shortestPath(int a[][] , int i , int j , int x , int y , boolean vis[][]) {
		if(!isValid(a , i , j , vis))
			return 10000;      // Mtlb koi rasta hi nhi hai
		
		if(i==x && j==y)   // if index is destination then shortest path is 0.
			return 0;
		
		vis[i][j] = true;   // if it is not destination mark it as visited.
		
		int top = shortestPath(a , i-1 , j , x , y , vis) + 1;   // Here +1 is coz side me jana v ek step hai
		int left = shortestPath(a , i , j-1 , x , y , vis) + 1; 
		int bottom = shortestPath(a , i+1 , j , x , y , vis) + 1;
		int right = shortestPath(a , i , j+1 , x , y , vis) + 1;
		
		vis[i][j] = false;  // This is actual backtracking line where we are again making position false which we have already visited so another path could also be visited.
		
		return (Math.min(Math.min(left, right) , Math.min(top, bottom)));
		
	}
}
