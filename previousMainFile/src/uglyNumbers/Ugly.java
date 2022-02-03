package uglyNumbers;

import java.util.Scanner;

public class Ugly {
	
//	public static void primeFactors(int x) {  // code to find prime factors
//		int i=2;
//		
//		while(x>1) {
//			while(x%i == 0) {
//				System.out.print(i + " ");
//				
//				x = x/i;
//			}
//			i++;
//		}
//	}
	
	static boolean isUgly(int x) {
		if(x==1)
			return true;
		
		while(x > 1) {
			while(x%2 == 0) {
				x = x/2;
			}
			while(x%3 == 0) {
				x = x/3;
			}
			while(x%5 == 0) {
				x = x/5;
			}
			if(x==1)
				return true;
			else
				return false;
		}
		return false;
	}
	
	public static int uglyNumber(int n) {
		int count = 1;
		int i = 2;
		
		while(count < n) {
			if(isUgly(i)) {
				count++;
			}
			i++;
		}
		return i-1;  // we decrement it by 1 b/c one extra incrementation is there
	}

	public static void main(String[] args) {
		System.out.println("Enter any number:  ");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		//System.out.println(isUgly(11));
		System.out.println(uglyNumber(x));
	}

}
