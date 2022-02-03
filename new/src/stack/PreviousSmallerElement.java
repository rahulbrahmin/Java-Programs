package stack;

import java.util.Stack;

public class PreviousSmallerElement {

	public static void main(String[] args) {
//		int a[] = {4 , 10 , 5 , 8 , 20 , 15 , 3 , 12};
//		int a[] = {5 , 15 , 20 , 25 , 12 , 20};
	
		/**
		for(int i=0 ; i<a.length ; i++) {
			int flag = 0;
			
			for(int j=i ; j>=0 ; j--) {
				if(a[j] < a[i]) {
					flag = 1;
					System.out.print(a[j] + " ");
					break;
				}
			}
			
			if(flag == 0)
				System.out.print(-1 + " ");
		}
		**/
		
		int a[] = {4 , 10 , 5 , 8 , 20 , 15 , 3 , 12};
//		int a[] = {5 , 15 , 20 , 25 , 12 , 20};
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=0 ; i<a.length ; i++) {
	
			while(!st.isEmpty() && st.peek() >= a[i]) {       // for previous greater element use
				st.pop();                                     //        (st.peek() <= a[i])
			}
			
			if(st.isEmpty()) {
				System.out.print(-1 + " ");
			}
			else {
				System.out.print(st.peek() + " ");
			}
			
			st.push(a[i]);
		}
	}

}
