package chegg;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String:  ");
		String s = sc.nextLine();
		
		// Calling non - recursive function to check palindrome.
		System.out.println(isPalindrome(s));
		
		// Calling recursive function to check palindrome.
		System.out.println(isPalindrome(s , 0 , s.length()-1));
	}
	
	// a) Non-Recursive function to check whether String is Palindrome or not. 
	static boolean isPalindrome(String s) {
		String temp = "";
		
		// Reversing given String.
		for(int i=s.length()-1 ; i>=0 ; i--) {
			temp += s.charAt(i);
		}
		
		// Check if original string is equal to reversed string then given string is palindrome else not a palindrome.
		if(temp.equals(s))
			return true;
		else
			return false;
	}
	
	// b) Recursive function to check whether String is Palindrome or not.
	static boolean isPalindrome(String s , int l , int r) {
		
		// If length is 0 then return true.
		if(s.length() == 0) {
			return true;
		}
		
		// If both indexes are equal then return true.
		if(l==r) {
			return true;
		}
		
		// if characters at l and r is not equal then return false.
		if(s.charAt(l) != s.charAt(r)) {
			return false;
		}
		
		// Till l is less than r+1 keep calling function recursively.
		if(l < r+1) {
			isPalindrome(s , l+1 , r-1);                // recursive call
		}
		
		return true;
	}
}
