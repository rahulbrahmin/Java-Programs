package string;

import java.util.*;

public class PrintDuplicates {

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		
		count(s);
		
		System.out.println();
		
		duplicates(s);
	}
	
	// using simple array of 256 length as there are only 256 characters in total
	static void count(String s) {
		int a[] = new int[256];
		
		// to remove duplicacy
		
		boolean dup[] = new boolean[256];
		
		for(int i=0 ; i<s.length() ; i++) {
			a[(int)s.charAt(i)]++;
		}
		
		for(int i=0 ; i<s.length() ; i++) {
			if(a[(int)s.charAt(i)] > 1 && !dup[(int)s.charAt(i)]) {
				System.out.println(s.charAt(i) + " , Count = " + a[(int)s.charAt(i)]);
				
				dup[(int)s.charAt(i)] = true;
			}
		}
	}
	
	// Using hash map
	
	static void duplicates(String s) {
		HashMap<Character , Integer> hs = new HashMap();
		
		for(int i=0 ; i<s.length() ; i++) {
			
			// if map already conatains that character , increase its frequency by 1 else add it
			if(hs.containsKey(s.charAt(i)))
				hs.put(s.charAt(i), hs.get(s.charAt(i)) + 1);
			else
				hs.put(s.charAt(i), 1);
		}
		
		for(Map.Entry<Character, Integer> m : hs.entrySet()) {
			if(m.getValue() > 1)
				System.out.println(m.getKey() + " , Count = " + m.getValue());
		}
	}
}
