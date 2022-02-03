package bitManipulation;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if((x & 1) == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
