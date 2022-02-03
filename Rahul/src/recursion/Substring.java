package recursion;

public class Substring {

	public static void main(String[] args) {
		subs("abc" , "");
	}
	
	static void subs(String s , String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
			return ;
		}
		
		char c = s.charAt(0);
		String ros = s.substring(1);
		
		subs(ros , ans);
		subs(ros , ans+c);
	}
}
