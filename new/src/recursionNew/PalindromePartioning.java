package recursionNew;

import java.util.*;

public class PalindromePartioning {

	public static void main(String[] args) {
		String s = "aabb";
		
		List<List<String>> ans = new ArrayList<>();
		List<String> ls = new ArrayList<>();
		
		partition(0 , s , ls , ans);
		
		System.out.println(ans);
	}
	
	static void partition(int ind , String s , List<String> ls , List<List<String>> ans) {
		if(ind == s.length()) {
			ans.add(new ArrayList<>(ls));
			return;
		}
		
		for(int i=ind ; i<s.length() ; i++) {
			if(isPalindrome(s , ind , i)) {
				ls.add(s.substring(ind , i+1));
				
				partition(ind+1 , s , ls , ans);
				
				// remove while backtracking
				ls.remove(ls.size()-1);
			}
		}
	}
	
	static boolean isPalindrome(String s , int l , int r) {
		while(l <= r) {
			if(s.charAt(l++) != s.charAt(r--))
				return false;
		}
		
		return true;
	}

}
