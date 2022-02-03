package recursionNew;

import java.util.Scanner;

public class PrintNto1Backtracking {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of n:  ");
		int n = sc.nextInt();
		
		printBacktracking(1 , n);
	}
	
	static void printBacktracking(int i , int n) {
		if(i > n)
			return;
		
		printBacktracking(i+1 , n);
		
		System.out.println(i);
	}
}
