package arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestAndSmallest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array:  ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter " + n + " elements:  ");
		
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		
//		int count = 0;
//		int temp = Integer.MIN_VALUE;
//		
//		for(int i=0 ; i<n ; i++) {
//			if(count == 3)
//				break;
//		}
//		System.out.println(max);
		
		Arrays.sort(a);
		
		System.out.println("Enter kth value:  ");
		int k = sc.nextInt();
		
		System.out.println(k + "th largest value:  " + a[n-k]);
		System.out.println(k + "th Smallest value:  " + a[k-1]);
	}

}
