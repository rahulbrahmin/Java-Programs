package arrays.basic;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of students:  ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter marks of " + n + " students:-");
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		int s = 0;
		
		for(int i=0 ; i<n ; i++) {
			s += a[i];
		}
		
		System.out.print("Average mark of students is: " + (s/n));
	}

}
