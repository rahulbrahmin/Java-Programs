package recursion;

public class SubstringWithAscii {

	public static void main(String[] args) {
		
		subseq("AB" , "");
	}
	
	static void subseq(String s , String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
			return ;
		}
		
		char c = s.charAt(0);
		int code = c;       //ASCII code of c
		String ros = s.substring(1);
		
		subseq(ros , ans);
		subseq(ros , ans+c);
		subseq(ros , ans+code);
//	or	subseq(ros , ans + String.valueOf(code));
	}
}
