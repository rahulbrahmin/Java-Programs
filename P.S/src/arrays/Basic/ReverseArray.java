package arrays.Basic;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array:  ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter " + n + " elements:  ");
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
//		int b[] = new int[n];
//		
//		int k=0;
//		
//		for(int i=n-1 ; i>=0 ; i--) {
//			b[k] = a[i];
//			k++;
//		}
//		
//		System.out.println("Array after reversing is:  ");
//		for(int i=0 ; i<n ; i++) {
//			System.out.print(b[i] + " ");
//		}
		
		System.out.println("Original array: ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(a[i] + " ");
		}
		
		int k = n-1;
		for(int i=0 ; i<n/2 ; i++) {
			int temp = a[i];
			a[i] = a[k];
			a[k] = temp;
			
			k--;
		}
		
		System.out.println();
		System.out.println("Array after reversing is:  ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(a[i] + " ");
		}
 
	}
	
	 static void swap(int x , int y) {
		int temp = x;
		x = y;
		y = temp;
		
		return;
	}

}
