package forLoop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:  ");
		int x=sc.nextInt();
		System.out.println("Enter its power:  ");
		int y=sc.nextInt();
		
		int r=1;
		for(int i=0;i<y;i++) {
			r*=x;
		}
		System.out.println("Power of given number is: " + r);
	}

}
