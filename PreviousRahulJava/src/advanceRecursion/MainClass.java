package advanceRecursion;

import java.util.*;

public class MainClass {
	
	static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) {
		int a[][] = {
				{1 , 2, 1, 4, 5},
				{1 , 2, 2 , 3, 4},
				{1 , 2, 2 , 2, 5},
				{2, 2, 2, 1 , 4}, 
				{1, 2, 2, 1, 3}
				 
		};
		
//		print(a , a.length , a[0].length);
//		floodFill(a , 1 , 2 , 2 , 6);
//		System.out.println();
//		print(a , a.length , a[0].length );
		
		String s = "abcc";
		permutations(s , 0 , 2);
	}
	
	static void floodFill(int a[][] , int r , int c , int prevFill , int nextFill) {
		int rows = a.length;
		int cols = a[0].length;
		
		if(r <0 || r >= rows || c <0 || c>= cols)
			return ;
		
		if(a[r][c] != prevFill)
			return ;
		
		a[r][c] = nextFill;
		
		floodFill(a , r+1 ,c , prevFill , nextFill );
		floodFill(a , r-1 , c , prevFill , nextFill);
		floodFill(a , r , c+1 , prevFill , nextFill);
		floodFill(a , r , c-1 , prevFill , nextFill);
	}
	
	static void print(int a[][] , int r , int c) {
		for(int i=0 ; i<r ; i++) {
			for(int j=0 ; j<c ; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void permutations(String s , int l , int r) {
		if(l==r) {
			if(set.contains(s))
				return ;
			
			set.add(s);
			System.out.println(s);
			return;
		}
		
		for(int i=0 ; i<s.length() ; i++) {
			s = interchange( s, l , i);
			permutations(s , l+1 , r);
			s = interchange(s , l , i);
		}
	}
	
	static String interchange(String s , int a , int b) {
		char[] c = s.toCharArray();
		
		char temp = c[a];
		c[a] = c[b];
		c[b] = temp;
		
		return String.valueOf(c);
	}

}
