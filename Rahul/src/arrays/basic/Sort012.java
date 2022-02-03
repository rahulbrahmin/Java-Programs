package arrays.basic;

import java.util.Scanner;

public class Sort012 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array:  ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter " + n + " elements:  ");
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		for(int i=0 ; i<n ; i++) {
			if(a[i] == 0)
				count0++;
			
			if(a[i] == 1)
				count1++;
			
			if(a[i] == 2)
				count2++;
		}
		
		System.out.println("Original Array:  ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(a[i] + " ");
		}
		
		for(int i=0 ; i<count0 ; i++)
			a[i] = 0;
		
		for(int i=count0 ; i<n-count2 ; i++)
			a[i] = 1;
		
		for(int i=(count0+count1) ; i<n ; i++)
			a[i] = 2;
		
		System.out.println();
		System.out.println();
		System.out.println("Array after sorting:  ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
