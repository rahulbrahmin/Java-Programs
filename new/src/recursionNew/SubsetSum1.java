package recursionNew;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum1 {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		
		int a[] = {2,3};
		int[] b = {3 , 1 , 2};
		
		subsetSum(0  , b , ar , 0);
		
		Collections.sort(ar);
		
		for(int x : ar)
			System.out.print(x + " ");
	}
	
	//brute force
	
	static void subsetSum(int ind , int[] ar , ArrayList<Integer> a , int s) {
		
		if(ind >= ar.length) {
			
			a.add(s);
			
			return;
		}
		
		subsetSum(ind + 1 , ar , a , s + ar[ind]);

		subsetSum(ind+1 , ar , a , s);
	}
}
