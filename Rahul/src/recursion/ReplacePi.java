package recursion;

public class ReplacePi {

	public static void main(String[] args) {
		String s = "pippxxppiixpi";
		
//		System.out.println(s.replaceAll("pi", "3.14"));
		replacePi(s);
	}
	
	static void replacePi(String s) {
		if(s.length() == 0)
			return;
		
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i') {
			System.out.print("3.14");
			replacePi(s.substring(2));
		}
		else {
			System.out.print(s.charAt(0));
			replacePi(s.substring(1));
		}
	}
}
