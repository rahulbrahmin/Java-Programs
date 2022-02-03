package recursionNew;

import java.util.Scanner;

public class PrintNamesNTimes {

	public static void print(int i , int n , String s) {
		if(i>n)
			return;
		
		System.out.print(s + " ");
		
		print(i+1 , n , s);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of times you want to print your name:  ");
		int n = sc.nextInt();
		
		System.out.println();
		print(1 , n , "Rudramani Dubey");
	}

}
