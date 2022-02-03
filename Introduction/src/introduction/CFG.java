package introduction;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CFG {
	public static void main (String[] args) {
		//code
		String s = "aaacca";
		int count = 1;
		
		Stack<Character> st = new Stack();
		st.push(s.charAt(0));
		
		for(int i=1 ; i<s.length() ; i++) {
			char c = s.charAt(i);
			
			if(c == st.peek()) {
				count++;
			}
			else {
				System.out.print(count);
				System.out.print(st.peek());
				st.pop();
				st.push(c);
				count = 1;
			}
			
		}
		
	}
}	