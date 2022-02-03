package chegg;

import java.util.Scanner;

public class IncreasingOrDecreasing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:  ");
		int x = sc.nextInt();
		
		int length = 0;
		
		int temp = x;
		
		while(temp != 0) {
			temp = temp / 10;
			length++;
		}
		
		int arr[] = new int[length];
		temp = x;
		
		int k = 0;
		while(temp != 0) {
			int r = temp % 10;
			arr[k] = r;
			temp = temp/10;
			k++;
		}
		
		k--;
		for(int i=0 ; i<arr.length/2 ; i++) {
			int z = arr[i];
			arr[i] = arr[k];
			arr[k] = z;
			
			k--;
		}
		
		int flag = 1;
		
		for(int i=0 ; i<arr.length-1 ; i++) {
			if(arr[i] > arr[i+1]) {
				flag = 0;
				break;
			}
		}
		
		if(flag == 1)
			System.out.println("Increasing order");
		else
			System.out.println("Not in increasing order");
		
		
		/* Recursive function called */
		if(isIncreasing(arr , arr.length)) {
			System.out.println("Increasing order");
		}
		else
			System.out.println("Not in increasing order");
	}
	
	public static boolean isIncreasing(int a[] , int n) {      // Recursive Function
		if(n==1 || n==0)
			return true;
		
		if(a[n-1] < a[n-2])
			return false;
		
		return isIncreasing(a , n-1);
	}

}
