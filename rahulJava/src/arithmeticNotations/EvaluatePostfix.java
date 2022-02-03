package arithmeticNotations;

import java.util.Stack;

public class EvaluatePostfix {

	public static void main(String[] args) {
		String s = " 54 6 + 7 4 - * 9 / 35 15 + +";
		Stack<Integer> stack = new Stack<>();
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i) != ' ') {
				char c = s.charAt(i);
				
				if(Character.isDigit(c)) {
					int j = i + 1;
					int x = (c - '0');
					while(Character.isDigit(s.charAt(j))) {
						x = (x * 10) + (s.charAt(j) - '0');
						j++;
					}
					i = j;
					stack.push(x);
				}
				
				else {
					int a = stack.pop();
					int b = stack.pop();
					
					switch(c) {
					case '+':{
						stack.push(b + a);
						break;
					}
					
					case '-':{
						stack.push(b - a);
						break;
					}
					
					case '*':{
						stack.push(b * a);
						break;
					}
					
					case '/':{
						stack.push(b / a);
						break;
					}
					}
				}
			}
		}
		
		System.out.println(stack.peek());
	}

}
