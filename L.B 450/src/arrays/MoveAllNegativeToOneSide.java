package arrays;

import java.util.Scanner;

public class MoveAllNegativeToOneSide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Given Array:  ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(a[i] + " ");
		}
		
		int k = 0;
		for(int i=0 ; i<n ; i++) {
			if(a[i] > 0) { 
				k = i;
				break;
			}
		}
		
		int j = k;
		
		for(int i=j+1 ; i<n ; i++) {
			if(a[i] < 0) {
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;
				k++;
			}
		}
		
		System.out.println();
		System.out.println("Final array:  ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
