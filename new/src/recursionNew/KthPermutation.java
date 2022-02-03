package recursionNew;

import java.util.*;

public class KthPermutation {

	public static void main(String[] args) {
		int n = 3;
		int k = 3;
		
		int a[] = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			a[i] = i+1;
		}
		
		int ans[] = kthPermu(a , 1 , k);
		
		for(int x : ans)
			System.out.print(x + " ");
		
	}
	
	static int[] kthPermu(int a[] , int count , int k) {
		if(count == k)
			return a;
		
		a = nextPermutation(a);
		
		return kthPermu(a , count+1 , k);
	}
	
	static int[] nextPermutation(int a[]) {
		boolean flag = false;
		int ind1 = -1;
		
		for(int i=a.length-2 ; i>=0 ; i--) {
			if(a[i] < a[i+1]) {
				ind1 = i;
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			reverse(a , 0 , a.length-1);
			return a;
		}
		
		int ind2 = -1;
		
		for(int i=a.length-1 ; i>=0 ; i--) {
			if(a[i] > a[ind1]) {
				ind2 = i;
				break;
			}
		}
		
		swap(a , ind1 , ind2);
		
		reverse(a , ind1+1 , a.length-1);
		
		return a;
	}
	
	static void swap(int a[] , int i , int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void reverse(int a[] , int x , int y) {
		while(x <= y) {
			swap(a , x++ , y--);
		}
	}
}
