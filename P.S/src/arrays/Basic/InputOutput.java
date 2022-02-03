package arrays.Basic;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		
		System.out.println("Enter elements:  ");
		for(int i=0 ; i<10 ; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Entered elements are:  ");
		for(int i=0 ; i<10 ; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
