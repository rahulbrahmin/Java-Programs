package stringsBasic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string:  ");
		
		String s = sc.nextLine();
		
		System.out.print("Reverse of " + s + " is: " );
//		for(int i=s.length() - 1 ; i>=0 ; i--) {
//			System.out.print(s.charAt(i));
//		}
		
		/* Another Method */
		
		int i = 0 ; 
		int j = s.length() - 1;
		
		char c[] = s.toCharArray();
		
		while(i < j) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			
			i++;
			j--;
		}
		
		System.out.print(c);
	}

}
