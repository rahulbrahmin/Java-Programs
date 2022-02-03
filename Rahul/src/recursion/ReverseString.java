package recursion;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string:  ");
		String s = sc.nextLine();
		
		reverse(s);
		
	}
	
	static void reverse(String s) {
		if(s.length() == 0)
			return ;
		
		String res = s.substring(1);
		reverse(res);
		System.out.print(s.charAt(0));
	}
}
