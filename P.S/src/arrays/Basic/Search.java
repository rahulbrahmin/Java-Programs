package arrays.Basic;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:  ");
		int m = sc.nextInt();
		
		int[] a = new int[m];
		
		System.out.println("Enter elements:  ");
		for(int i=0 ; i<m ; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Entered elements are:  ");
		for(int i=0 ; i<m ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.println("Enter element to be searched");
		int n = sc.nextInt();
		
		int flag = 0;
		int k = -1;
		
		for(int i=0 ; i<m ; i++) {
			if(a[i] == n) {
				flag = 1;
				k = i;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println("Element found at " + (k+1) + " position");
		}
		else {
			System.out.println("Elemet not found");
		}

	}

}
