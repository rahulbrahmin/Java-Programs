package recursion;

public class RemoveDuplicate {

	public static void main(String[] args) {
		System.out.println(removeDuplicates("aaaabbbeeecdddd"));

	}
	
	static String removeDuplicates(String s) {
		if(s.length() == 0 || s.length() == 1)
			return s;
		
		char c = s.charAt(0);
		String ans = removeDuplicates(s.substring(1));
		
		if(ans.charAt(0) == c)
			return ans;
		
		return (c+ans);
	}
}
