package whileLoop;

import java.util.Scanner;;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter any number:  ");
//		int n=sc.nextInt();
//		int s=0;
//		int x=n;
		int n=1;
		do {
			 n=sc.nextInt();
			 System.out.print(n+" ");
		}while(n!=0);
	}

}
