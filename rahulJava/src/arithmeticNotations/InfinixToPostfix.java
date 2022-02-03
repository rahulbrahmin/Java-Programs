package arithmeticNotations;

import java.util.Stack;

public class InfinixToPostfix {

	public static void main(String[] args) {
		String s = "A+(B*C-(D/E^F)*G)*H";
		
		System.out.println(infinixToPostfix(s));
	}
	
	public static String infinixToPostfix(String s){
		int n = s.length();
		String ans = "" ;
		s += ')';
		
		Stack<Character> stack = new Stack<>();
		stack.push('(');
		
		for(int i=0 ; i<=n ; i++) {
			char c = s.charAt(i);
			if(c == ' ')
				continue;
			
			if(Character.isAlphabetic(c)) {
				ans += c;
				continue;
			}
			
			switch(c) {
			case '+': {
				char temp = stack.peek();
				if(temp == '*' || temp == '/' || temp == '^') {
					ans += stack.peek();
					stack.pop();
					stack.push(c);
				}
				else {
					stack.push(c);
				}
				break;
			}
			
			case '-': {
				char temp = stack.peek();
				
				if(temp == '+' || temp == '*' || temp == '/' || temp == '^') {
					ans += temp;
					stack.pop();
					stack.push(c);
				}
				else {
					stack.push(c);
				}
				
				break;
			}
			
			case '(':
			{
				stack.push(c);
				break;
			}
			
			case '*' :{
				char temp = stack.peek();
				if(temp == '/' || temp == '^') {
					ans += temp;
					stack.pop();
					stack.push(c);
				}
				else
					stack.push(c);
				
				break;
			}
			
			case '/' :{
				char temp = stack.peek();
				if(temp == '^') {
					ans += temp;
					stack.pop();
					stack.push(c);
				}
				else
					stack.push(c);
				
				break;
			}
			
			case '^' :{
				stack.push(c);
				
				break;
			}
			
			case ')' :{
				while(stack.peek() != '(') {
					ans += stack.peek();
					stack.pop();
				}
				stack.pop();
				
				if(stack.isEmpty())
					break;
			}
		}
	}
		return ans;
 }

}
