package heap;

import java.util.Scanner;

public class Heapify {

	public static void main(String[] args) {
		int a[] = new int[8];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1 ; i<7 ; i++) {
			a[i] = sc.nextInt();
		}
		
		buildHeap(a , a.length);
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(a[i] + " ");
		}

	}
	
	static void heapify(int a[] , int n , int i) {
		int largest = i;
		int l = 2*i;
		int r = (2*i) + 1;
		
		if(l<n && a[l]>a[largest])
			largest = l;
		
		if(r<=n && a[r]>a[largest])
			largest = r;
		
		if(largest != i) {
			swap(a , i , largest);
			heapify(a , n , largest);
		}
	}
	
	static void buildHeap(int a[] , int n) {
		for(int i=n/2 ; i>0 ; i--) {
			heapify(a , n , i);
		}
	}
	
	static void swap(int arr[] , int a , int b) {
		arr[a] = arr[a]^arr[b];
		arr[b] = arr[a]^arr[b];
		arr[a] = arr[a]^arr[b];
	}

}
