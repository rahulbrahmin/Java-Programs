package recursionNew;

import java.util.*;

public class RatInMaze {

	public static void main(String[] args) {
		int mat[][] = {
				{1 , 0 , 0 , 0},
				{1 , 1 , 0 , 1},
				{1 , 1 , 0 , 0},
				{0 , 1 , 1 , 1},
		};
		
		boolean vis[][] = new boolean[mat.length][mat[0].length];
		
		List<String> ans = new ArrayList<>(); 
		
		maze(mat , 0 , 0 , vis , "" ,  ans);
		
		System.out.println(ans);
	}
	
	static void maze(int[][] a, int i , int j , boolean[][] vis , String s , List<String> ls) {
		if(i==a.length-1 && j==a[0].length-1) {
			ls.add(s);
			return;
		}
		
		//down
		if(i+1 < a[0].length && a[i+1][j] == 1 && !vis[i+1][j]) {
			vis[i+1][j] = true;
			maze(a , i+1 , j , vis , s+'D' , ls);
			vis[i+1][j] = false;
		}
		
		//left
		if(j-1 > 0 && a[i][j-1] == 1 && !vis[i][j-1]) {
			vis[i][j-1] = true;
			maze(a , i , j-1 , vis , s+'L' , ls);
			vis[i][j-1] = false;
		}
		
		//Right
		if(j+1 < a[0].length && a[i][j+1] == 1 && !vis[i][j+1]) {
			vis[i][j+1] = true;
			maze(a , i , j+1 , vis , s+'R' , ls);
			vis[i][j+1] = false;
		}
		
		//Up
		if(i-1 > 0 && a[i-1][j] == 1 && !vis[i-1][j]) {
			vis[i-1][j] = true;
			maze(a , i+1 , j , vis , s+'U' , ls);
			vis[i-1][j] = false;    // backtrack
		}
	}
}
