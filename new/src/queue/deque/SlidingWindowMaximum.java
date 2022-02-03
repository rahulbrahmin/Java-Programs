package queue.deque;

import java.util.*;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int[] a = {4 , 1 , 3 , 5 , 1 , 2 , 3 , 2 , 1 , 1 , 5};
		int[] b = {2 , 3,7 ,4 ,6 ,2};
		
		sliding(a , 3);
		
		System.out.println();
		slidingWindow(a , 3);
		
		System.out.println();
		slidingWindowMax(a , 3);
	}
	
	// in O(n*k)
	static void sliding(int[] a , int k) {
		for(int i=0 ; i<=a.length-k ; i++) {
			int max = Integer.MIN_VALUE;
			
			for(int j=i ; j<i+k ; j++)
				max = Math.max(a[j] , max);
			
			System.out.print(max + " ");
		}
	}
	
	// In O(n logk) using priority queue(max heap).
	
	static void slidingWindow(int[] a, int k) {
		// max heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0 ; i<k ; i++) {
			pq.add(a[i]);
		}
		
		System.out.print(pq.peek() + " ");
		pq.remove(a[0]);
		
		for(int i=k ; i<=a.length-1 ; i++) {
			pq.add(a[i]);
			
			System.out.print(pq.peek() + " ");
			
			pq.remove(a[i-k+1]);
		}
	}
	
	// optimal solution O(n) using doubly ended queue Deque.
	
	static void slidingWindowMax(int a[] , int k) {
		Deque<Integer> dq = new ArrayDeque<>();
		
		for(int i=0 ; i<k ; i++) {
			while(!dq.isEmpty() && a[i] >= dq.getLast())
				dq.removeLast();
			
			dq.addLast(a[i]);
		}
		
		System.out.print(dq.getFirst() + " ");
		dq.remove(a[0]);
		
		for(int i=k ; i<=a.length; i++) {
			while(!dq.isEmpty() && a[i] >= dq.getLast())
				dq.removeLast();
			
			dq.addLast(a[i]);
			
			System.out.print(dq.getFirst() + " ");
			
			dq.remove(a[i-k+1]);
		}
	}
}
