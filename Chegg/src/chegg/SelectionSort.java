package chegg;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		// To take inputs
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		
		// Taking size of array as input
		int n = sc.nextInt();
		System.out.println();
		
		// Declaring array of size n
		int a[] = new int[n];
		
		System.out.println("Enter " + n + " elements:  ");
		
		// Taking array as input
		for(int i=0 ; i<n ; i++)
			a[i] = sc.nextInt();
		
		// Printing array before sorting.
		System.out.println();
		System.out.println("Array before sorting:  ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// Code for selection sort
		for(int i=0 ; i<n-1 ; i++) {
			int temp = i;
			
			for(int j=i+1 ; j<n ; j++) {
				if(a[temp] > a[j])
					temp = j;	
			}
			
			int temp1 = a[i];
			a[i] = a[temp];
			a[temp] = temp1;
		}
		
		// Printing the array after sorting.
		System.out.println("Array after sorting:  ");
		for(int i=0 ; i<n ; i++)
			System.out.print(a[i] + " ");
	}

}
