package forLoop;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Enter terms of fibonacci series:  ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		
		for(int i=0;i<n-2;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}

}
