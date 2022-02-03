package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int[] a = {3, 4, 5, 6, 7, 8, 9};
		int[] b = {9 , 8, 7, 6, 5, 4};
		
		bubbleSort(b , b.length);
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i] + " ");
		}
		
		Arrays.sort(a);
		int n = a.length;
		
		//System.out.println(binarySearch(a , 0 , n-1 , 9 , n) );
	}
	static int binarySearch(int[] a , int lb , int ub , int item , int n) {
		int beg = lb;
		int end = ub;
		
		//int loc = -1;
		while(beg <= end) {
			int mid = (beg + end) / 2;
			if(a[mid] == item)
				return mid;
			
			else if(item > a[mid])
				beg += 1;
			else
				end -= 1;
			
		}
		return -1;
	}
	
	public static void bubbleSort(int a[] , int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
}
