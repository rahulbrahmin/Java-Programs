package stack;

import java.util.ArrayDeque;

public class LargestAreaSubmatrix {

	public static void main(String[] args) {
		int a[][] = {
				{1 , 1 , 0 , 1 , 1},
				{1 , 1 , 1 , 1 , 1},
				{0 , 1 , 1 , 1 , 1},
				{1 , 1 , 1 , 1 , 1},
				{1 , 0 , 1 , 1 , 1},
				{1 , 1 , 1 , 1 , 1}
		};
		
		int b[][] = {
	            { 0, 1, 1, 0 },
	            { 1, 1, 1, 1 },
	            { 1, 1, 1, 1 },
	            { 1, 1, 0, 0 },
	        };

		
		System.out.println(maxArea(a));
		System.out.println(maxArea(b));
	}
	
	static int maxArea(int a[][]) {
		int temp[] = new int[a[0].length];
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[i].length ; j++) {
				if(a[i][j] == 1)
					temp[j]++;
				else
					temp[j] = 0;
			}
			
			int[] prev = prevSmaller(temp);
			int[] next = nextSmaller(temp);
			
			int maxAr = Integer.MIN_VALUE;
			
			for(int k=0 ; k<temp.length ; k++) {
				int ar = (next[k] - prev[k] - 1) * temp[k];
				
				maxAr = Math.max(maxAr, ar);
			}
			
			max = Math.max(max, maxAr);
		}
		
		return max;
	}
	
	static int[] prevSmaller(int a[]) {
		int prev[] = new int[a.length];
		
		ArrayDeque<Integer> st = new ArrayDeque<>();
		
		for(int i=0 ; i<a.length ; i++) {
			while(!st.isEmpty() && a[st.peek()] >= a[i])
				st.pop();
			
			if(st.isEmpty())
				prev[i] = -1;
			else                                   // i.e if(st.peek() < a[i])
				prev[i] = st.peek();
			
			st.push(i);
		}
		
		return prev;
	}
	
	static int[] nextSmaller(int a[]) {
		int next[] = new int[a.length];
		ArrayDeque<Integer> st = new ArrayDeque<>();
		
		for(int i=a.length-1 ; i>=0 ; i--) {
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
