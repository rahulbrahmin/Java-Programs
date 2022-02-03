package arraysMedium;

import java.util.Scanner;

public class GraetestThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of array:  ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter " + n + " elements:  ");
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array is:  ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(a[i] + " ");
		}
		
		int max1 = Integer.MIN_VALUE;
		
		for(int i=0 ; i<n ; i++) {
			if(a[i] > max1) {
				max1 = a[i];
			}
		}
		
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		for(int i=0 ; i<n ; i++) {
			if(a[i] > max2 && a[i] < max1) {
				max2 = a[i];
			}
		}
		
		for(int i=0 ; i<n ; i++) {
			if(a[i] > max3 && a[i] < max2) {
				max3 = a[i];
			}
		}
		
		System.out.println("\n\nGraetest Three Elements are:  ");
		System.out.println(max1 + " " + max2 + " " + max3);
	}
}
