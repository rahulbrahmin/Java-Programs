package stack;

import java.util.ArrayDeque;

public class LargestAreaInHistogram {

	public static void main(String[] args) {
		int a[] = {4 , 2 , 1 , 5 , 6 , 3 , 2 , 4 , 2};
		
		int prev[] = prevSmaller(a);
		
		int next[] = nextSmaller(a);
		
		for(int x : prev)
			System.out.print(x + " ");
		
		System.out.println();
		
		for(int x : next)
			System.out.print(x + " ");
		
		System.out.println();
		
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0 ; i<a.length ; i++) {
			int ar = ((next[i] - prev[i]) - 1) * a[i];
			
			max = Math.max(max, ar);
		}
		
		System.out.println(max);
		
		/* Brute force
		int max = Integer.MIN_VALUE;
		
		for(int i=0 ; i<a.length ; i++) {
			int left = i;
			int right = i;
			
			while(left >= 0 && a[left] >= a[i])
				left--;
			
			while(right < a.length && a[right] >= a[i])
				right++;
			
			int ar = (right - left - 1) * a[i];
			
			max = Math.max(max, ar);
		}
		
		System.out.println(max);
		*/
	}
	
	static int[] prevSmaller(int a[]) {
		int prev[] = new int[a.length];
		
		ArrayDeque<Integer> st = new ArrayDeque<>();
		
		for(int i=0 ; i<a.length ; i++) {
			while(!st.isEmpty() && a[st.peek()] >= a[i]) {
				st.pop();
			}if(st.isEmpty()) {
				prev[i] = -1;
			}
			else {
				prev[i] = st.peek();
			}
			
			st.push(i);
		}
		
		return prev;
	}
	
	static int[] nextSmaller(int a[]) {
		int[] next = new int[a.length];
		
		ArrayDeque<Integer> st = new ArrayDeque<>();
		
		for(int i = a.length-1 ; i>=0 ; i--) {
			while(!st.isEmpty() && a[st.peek()] >= a[i])
				st.pop();
			if(st.isEmpty())
				next[i] = a.length;
			else
				next[i] = st.peek();
			
			st.push(i);
		}
		
		return next;
	}

}
