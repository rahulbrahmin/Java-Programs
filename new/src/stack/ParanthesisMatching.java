package stack;

import java.util.ArrayDeque;

public class ParanthesisMatching {

	public static void main(String[] args) {
		String s = "(({[]}))";
		String s1 = "{((()))]";
		
		System.out.println(paranthesis(s));
		System.out.println(paranthesis(s1));
	}
	
	static boolean paranthesis(String s) {
		
		ArrayDeque<Character> st = new ArrayDeque<>();          // stack
		
		for(int i=0 ; i<s.length() ; i++) {
			char c = s.charAt(i);
			
			if(st.isEmpty()) {
				if(c == ')' || c == '}' || c == ']')
					return false;
			}
			
			if(c == '(' || c == '{' || c == '[') {
				st.push(c);
				continue;
			}
			
			if(!st.isEmpty()) {
				if(c == '}') {
					if(st.peek() == '{')
						st.pop();
					else
						return false;
				}
				
				if(c == ')') {
					if(st.peek() == '(')
						st.pop();
					else
						return false;
				}
				
				if(c == ']') {
					if(st.peek() == '[')
						st.pop();
					else
						return false;
				}
			}
		}
		
		if(st.isEmpty())
			return true;
		else
			return false;
	}

}
