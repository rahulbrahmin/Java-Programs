package revision;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter principal:  ");
		int p = sc.nextInt();
		
		System.out.print("Enter rate:  ");
		int r = sc.nextInt();
		
		System.out.print("Enter time:  ");
		int t = sc.nextInt();
		
		System.out.println("Simple Interest of given data is:  " + (p*r*t) / 100);
	}

}
