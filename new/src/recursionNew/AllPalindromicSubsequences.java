package recursionNew;

public class AllPalindromicSubsequences {

	public static void main(String[] args) {
		String s = "aab";
		
		subsequences(0 , s , "");
	}
	
	static void subsequences(int ind , String s , String temp) {
		
		if(ind == s.length()) {
			if(isPalindrome(temp))
				System.out.print(temp + " ");
			
			return ;
		}
		
		temp += s.charAt(ind);
		subsequences(ind+1 , s , temp);
		
		temp = temp.substring(0 , temp.length()-1);
		subsequences(ind+1 , s , temp);
	}
	
	static boolean isPalindrome(String s) {
		int l=0;
		int r=s.length()-1;
		
		while(l<=r) {
			if(s.charAt(l++) != s.charAt(r--))
				return false;
		}
		
		return true;
	}
}
