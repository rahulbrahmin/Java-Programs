package rahulJava;

import java.util.Scanner;

public class Si {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal:  ");
		int p=sc.nextInt();
		System.out.println("Enter rate:  ");
		float r=sc.nextFloat();
		System.out.println("Enter time:  ");
		int t=sc.nextInt();
		
		float SI=(p*r*t)/100;
		
		System.out.println("Simple intrest is:  " + SI);
				
				

	}

}

