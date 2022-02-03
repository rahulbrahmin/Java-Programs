package arrays.Basic;

import java.util.Arrays;

public class Temp {

	public static void main(String[] args) {
		int[] a = {3,5,1,5,9,10,2,6 };
		Arrays.sort(a);
		
		int n = a.length;
		
		int x = 0;
		
		if(n%2 == 0)
			x = n/2;
		else
			x=n/2+1;
		
		int temp[] = new int[x];
		
		int k=0;
		
		
		
		for(int i=0 ; i<n ; i+=2) {
			temp[k] = a[i];
			k++;
		}
		
		for(int i=0 ; i<temp.length ; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}
