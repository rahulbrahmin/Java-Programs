package forLoop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:  ");
		int x = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(x + " * " + i + " = " + x*i);
		}

	}

}
