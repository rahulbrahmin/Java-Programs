package stringsBasic;

import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:  ");
		String s = sc.nextLine();
		
		String temp = s;
		
		System.out.println("Repeated Characters are:  ");
		for(int i=0 ; i<s.length() ; i++) {
			for(int j=i+1 ; j<s.length() ; j++) {
				if(temp.charAt(i) == temp.charAt(j) && temp.charAt(j) != ' ') {
					System.out.print(temp.charAt(j) + " ");
					temp = temp.replace(s.charAt(j), ' ');
				}
			}
		}

	}

}
