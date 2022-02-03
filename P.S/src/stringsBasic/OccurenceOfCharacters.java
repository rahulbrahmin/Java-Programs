package stringsBasic;

import java.util.Scanner;

public class OccurenceOfCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:  ");
		
		String s = sc.nextLine();
//		
//		int count[] = new int[256];
//		    
//		
////		for(int i=0 ; i<s.length() ; i++) {
////			count[s.charAt(i)]++;
////			
//// 		}           or
//		for(char c : s.toCharArray()) {
//			int index = (int)c;
//			count[index]++;
//		}
		
		String temp = s;
		
		for(int i=0 ; i<s.length() ; i++) {
			int count = 0;
			char ch = temp.charAt(i);
			if(temp.charAt(i) != ' ') {
				count = countChar(temp , temp.charAt(i));
				temp = temp.replace(temp.charAt(i), ' ');
				
				System.out.println("Number of Occurence of "
						+ ch + " is = " + count);
			}
		}
	}
	
	static int countChar(String s , char ch) {
		int count = 0;
		
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
}
