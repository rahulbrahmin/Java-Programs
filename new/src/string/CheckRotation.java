package string;

import java.util.*;

public class CheckRotation {

	// check if one string is valid rotation of another one.
	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDAB";
		
		String c1 = "ABCD";
		String c2 = "ACBD";
		
		System.out.println(isValid(s1 , s2));
		System.out.println(isValid(c1 , c2));
		
		System.out.println();
		
		System.out.println(isRotation(s1 , s2));
		System.out.println(isRotation(c1 , c2));
	}
	
	static boolean isValid(String s1 , String s2) {
		if(s1.length() != s2.length())
			return false;
		
		s1 = s1.concat(s1);
		
		if(s1.indexOf(s2) == -1)
			return false;
		
		return true;
	}

	
	static boolean isRotation(String s1 , String s2) {
		if(s1.length() != s2.length())
			return false;
		
		Queue<Character> q1 = new LinkedList<>();
		Queue<Character> q2 = new LinkedList<>();
		
		for(int i=0 ; i<s1.length() ; i++)
			q1.add(s1.charAt(i));
		
		for(int i=0 ; i<s2.length() ; i++)
			q2.add(s2.charAt(i));
		
		for(int i=0 ; i<q2.size() ; i++) {
			char c = q2.remove();
			q2.add(c);
			
			if(q2.equals(q1))
				return true;
		}
		
		return false;
	}
}
