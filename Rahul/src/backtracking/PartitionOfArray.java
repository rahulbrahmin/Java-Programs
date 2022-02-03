package backtracking;

import java.util.ArrayList;

public class PartitionOfArray {

	public static void main(String[] args) {
		
		int a[] = {2, 1, 2, 3, 4, 8};
		int sum = 0;
		
		for(int i=0  ; i<a.length ; i++) {
			sum += a[i];
		}
		
		ArrayList<Integer> ans = new ArrayList<>();   // koi ek subarray ko store krne ke liye
		
		
		boolean isPossible = sum % 2 == 0             // or, (sum & 1) == 0
				&& partition(a , sum/2 , 0 , ans);
		
		if(isPossible) {
			for(int e:ans) {
				System.out.print(e + " ");
			}
		}else {
			System.out.println("Not possible");
		}

	}
	
	static boolean partition(int a[] , int sum , int i , ArrayList<Integer> ans) {
		if(i >= a.length || sum < 0)
			return false;
		
		if(sum == 0)               // mtlb mil gya
			return true;     
		
		ans.add(a[i]);     // When including sum
		
		boolean leftPossible = partition(a , sum-a[i] , i+1 , ans);   // first sum is included
		
		if(leftPossible)
			return true;
		
		// This makes backtracking possible.
		ans.remove(ans.size()-1);     // remove added sum;
		return partition(a , sum , i+1 , ans);
	}
}
