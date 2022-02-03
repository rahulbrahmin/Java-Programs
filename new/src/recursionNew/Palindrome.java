package recursionNew;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "MADAM";
		
		System.out.println(isPalindrome(s , s , 0 , s.length()-1));
		System.out.println(isPalindrome(s , 0 , s.length()-1));
	}
	
	static boolean isPalindrome(String s , int l , int r) {
		if(l >= r)
			return true;
		
		if(s.charAt(l) != s.charAt(r))
			return false;
		
		return isPalindrome(s , l+1 , r-1);
	}
	
	static boolean isPalindrome(String s , String s1 , int l , int r) {
		if(l >= r) {
			if(s.equals(s1))
				return true;
			else
				return false;
		}
		
		s1 = swap(s1 , l , r);
		
		return isPalindrome(s , s1 , l+1 , r-1);
	}
	
	static String swap(String s , int a , int b) {
		char[] c = s.toCharArray();
		
		char temp = c[a];
		c[a] = c[b];
		c[b] = temp;
		
		return String.valueOf(c);
	}
}
