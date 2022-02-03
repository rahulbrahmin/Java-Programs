package recursionNew;

import java.util.Scanner;

public class Print1toNBacktracking {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of n:  ");
		int n = sc.nextInt();
		
		printBacktracking(n);
	}
	
	static void printBacktracking(int n) {
		if(n < 1)
			return;
		
		printBacktracking(n-1);
		
		System.out.println(n);
	}
}
