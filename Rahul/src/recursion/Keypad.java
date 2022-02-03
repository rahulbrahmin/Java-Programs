package recursion;

public class Keypad {
	
	static String keyArr[] = {"" , "" , "abc" , "def" , "ghi" , "jkl" , 
			"mno" , "pqrs" , "tuv" , "wxyz"}; 
	
	public static void main(String[] args) {
		keyPad("237" , "");

	}
	
	static void keyPad(String s , String ans) {
		if(s.length() == 0){
			System.out.println(ans);
			return ;
		}
		
		char c = s.charAt(0);
		String code = keyArr[c-'0'];
		
		String ros = s.substring(1);
		
		for(int i=0 ; i<code.length() ; i++) {
			keyPad(ros , ans+code.charAt(i));
		}
	}
}
