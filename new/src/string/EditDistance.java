package string;

public class EditDistance {

	public static void main(String[] args) {
		String s = "geek";
		String t = "geesk";
		
		System.out.println(edit(s , t , s.length() - 1, t.length() - 1));
	}
	
	// using recursion
	
	static int edit(String s , String t , int m , int n) {
		
		// Base case / edge cases
		if(m == 0)
			return n;
		if(n == 0)
			return m;
		
		// common cases
		// when both characters are equal
		
		if(s.charAt(m) == t.charAt(n))
			return edit(s , t , m-1 , n-1) + 0;
		
		// if characters are not equal we can insert/replace/remove
		
		return Math.min(edit(s , t , m , n-1) + 1 , 
				Math.min(edit(s , t , m-1 , n) + 1, edit(s , t , m-1 , n-1) + 1));
	}
}
