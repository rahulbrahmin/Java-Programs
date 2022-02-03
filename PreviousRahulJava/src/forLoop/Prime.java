package forLoop;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Enter a number:  ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=1;
		for(int i=2;i*i<n;i++) {
			if(n%i==0) {
				r=0;
				break;
			}
		}
		
		if(n<2 || r==0) {
			System.out.println("Not a Prime Number");
		}
		else {
			System.out.println("Prime number");
		}
	}

}
