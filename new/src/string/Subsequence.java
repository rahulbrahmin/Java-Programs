package string;

import java.util.ArrayList;

public class Subsequence {

	public static void main(String[] args) {
		String s = "abc";
		
//		ArrayList<Character> ds = new ArrayList<>();
		
		subsequence(0 , s , new ArrayList<Character>());
	}
	
	static void subsequence(int i , String s , ArrayList<Character> ds) {
		
		// base case
		if(i == s.length()) {
			String temp = "";
			
			for(char c : ds)
				temp += c;
			
			System.out.println(temp);
			return;
		}
		
		// pick the index value
		
		ds.add(s.charAt(i));
		subsequence(i+1 , s , ds);
		
		// remove added value (non-pick) the index value
		
		ds.remove(ds.size()-1);
		subsequence(i+1 , s , ds);
	}
}
