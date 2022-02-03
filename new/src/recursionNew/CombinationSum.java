package recursionNew;

import java.util.*;

public class CombinationSum {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		
		int a[] = {2 , 3 , 6 , 7};
		
		combinationSum(0 , 7 , ar , temp , a);
		
		for(ArrayList<Integer> x : ar)
			System.out.println(x);
	}
	
	static void combinationSum(int ind , int target , ArrayList<ArrayList<Integer>> ar ,
			ArrayList<Integer> temp, int a[]) {
		
		// base case
		if(ind >= a.length) {
			
			// means our combination is valid
			if(target == 0) {
				ar.add(new ArrayList<>(temp));
			}
			
			return;
		}
		
		
		// pick case 
		if(a[ind] <= target) {
			temp.add(a[ind]);
			combinationSum(ind , target-a[ind] , ar , temp , a);
			
			// make sure of removing added element after after above function comes back (backtracks).
			temp.remove(temp.size() - 1);
		}
		
		// non - pick case
		
		combinationSum(ind+1 , target , ar , temp , a);
	}

}
