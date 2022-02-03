package recursion;

import java.util.Scanner;

public class AtoPowerB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a & b:  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + "^" + b  + " = " + fastPow(a , b));
		
	}
	
	static int pow(int a , int b) {
		if(b==0)
			return 1;
		
		return a * pow(a , b-1);
	}
	
	static int fastPow(int a , int b) {
		if(b==0)
			return 1;
		if(b%2 == 0)
			return fastPow(a*a , b/2);
		return a * fastPow(a , b-1);
	}
}
