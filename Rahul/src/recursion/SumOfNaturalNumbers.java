package recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number:  ");
		int n = sc.nextInt();
		
		System.out.println("Sum of first " + n + " number is:  " + sum(n));
		
	}
	
	static int sum(int n) {
		if(n==1)
			return 1;
		
		return n+sum(n-1);
	}

}
