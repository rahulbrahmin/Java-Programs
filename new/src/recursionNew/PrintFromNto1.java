package recursionNew;

import java.util.Scanner;

public class PrintFromNto1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of n:  ");
		int n = sc.nextInt();
		
		print(n);
	}
	
	static void print(int n) {
		if(n < 1)
			return;
		
		System.out.println(n);
		
		print(n-1);
	}
}
