package chegg;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfPowerOf2 {

	public static void main(String[] args) {
		//To take input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number:  ");
		//Taking input from user
		int n = sc.nextInt();
		
		//Displaying result by calling function.
		System.out.println();
		System.out.println(n + " = " + compute(n));
	}
	
	/*
	 * This method takes n as parameter.
	 * It returns sum of power of 2 of n in increasing order in form of string.
	 */
	static String compute(int n) {
		//ArrayList to store bits of number.
		ArrayList<Integer> ar = new ArrayList<>();
		
		//String to store return answer.
		String s = "";
		
		//Converting number to its binary form and storing its bits in arraylist.
		while(n > 0) {
			int temp = n % 2;
			ar.add(temp);
			n = n / 2;
		}
		
		//Traversing the arraylist.
		for(int i=0 ; i<ar.size() ; i++) {
			//If the current bit is 1 append 2 to the power of that index in string.
			if(ar.get(i) == 1) {
				s += (int)Math.pow(2, i);
				
				//To check is we are on last index then must not append + in our string.
				if(i != ar.size() - 1) {
					s += "+";
				}
			}
		}
		
		//returning required string
		return s;
	}

}
