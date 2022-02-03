package stack;

import java.util.*;

public class NextSmallerElement {

	public static void main(String[] args) {
		int a[] = {3 , 10 , 5 , 1 , 15 , 10 , 7 , 6};
//		int a[] = {10 , 20 , 30 , 40};
		ArrayList<Integer> ar = new ArrayList<>();
		
		ArrayDeque<Integer> st = new ArrayDeque<>();
		
		for(int i=a.length-1 ; i>=0 ; i--) {
			while(!st.isEmpty() && st.peek() >= a[i])
				st.pop();
			if(st.isEmpty())
				ar.add(-1);
			else
				ar.add(st.peek());
			
			st.push(a[i]);
		}
		
		for(int x : a) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		for(int i=ar.size()-1 ; i>=0 ; i--)
			System.out.print(ar.get(i) + " ");
	}

}
