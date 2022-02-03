package arrays.basic;

import java.util.Scanner;

public class ArrangeNegativePositive {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array:  ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter " + n + " elements:  ");
		
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Original Array:  ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(a[i] + " ");
		}
		
		int j=0;
		
		for(int i=0 ; i<n ; i++) {
			if(a[i] < 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
				j++;
			}
			
		}
		
		System.out.println();
		System.out.println("Final Array:  ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
