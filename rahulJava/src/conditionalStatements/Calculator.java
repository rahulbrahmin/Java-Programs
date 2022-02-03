package conditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number:  ");
		int a=sc.nextInt();
		System.out.println("Enter second number:  ");
		int b=sc.nextInt();
		
		System.out.println("Enter operation to be performed:  ");
		sc.nextLine();
		char operation=sc.nextLine().charAt(0);
		
		int r=0;
		
		switch(operation) {
		case '+':
			r=a+b;
			break;
		case '-':
			r=a-b;
			break;
		case '*':
			r=a*b;
			break;
		case '/':
			r=a/b;
			break;
		default:
			System.out.println("You have enterd invalid operation");
		}
		
			System.out.println("Your result is " + r);
	}

}
