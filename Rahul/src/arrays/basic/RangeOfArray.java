package arrays.basic;

import java.util.Scanner;

public class RangeOfArray {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array:  ");
		int n = sc.nextInt();
		
		int[] a = new int[9];
		
		System.out.println("Enter " + n + " elements:  ");
		
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0 ; i<n ; i++) {
			if(a[i] > max)
				max = a[i];
			
			if(a[i] < min)
				min = a[i];
		}
		
		System.out.print("Range of Array is:  " + (max - min));
	}

}
