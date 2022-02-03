package recursion;

public class MoveX {

	public static void main(String[] args) {
		System.out.println(moveX("axxbdxcefxhix"));
	}
	
	static String moveX(String s) {
		if(s.length() == 0)
			return s;
		
		char c = s.charAt(0);
		String ans = moveX(s.substring(1)) ;
		
		if(c == 'x') {
			return (ans + c);
		}
		
		return (c+ans);
	}
}
