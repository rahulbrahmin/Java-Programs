package recursionNew;

import java.util.ArrayList;

public class SubsequencesWithSumK {

	public static void main(String[] args) {
		int a[] = {1 , 2 , 1};
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		subsequencesWithK(0 , ar , a , 2);
		
		ArrayList<Integer> ar2 = new ArrayList();
		
		System.out.println();
		subsequence(0 , ar2 , a , 0 , 2);
	}
	
	// subsequence with sum k
	static void subsequence(int index , ArrayList<Integer> ar , int[] a , int sum , int k) {
		
		if(index >= a.length) {
			if(sum == k) {
				for(int x : ar)
					System.out.print(x + " ");
				System.out.println();
			}
			
			return;
		}
		
		ar.add(a[index]);
		sum += a[index];
		subsequence(index+1 , ar , a , sum , k);
		
		ar.remove(ar.size() - 1);
		sum -= a[index];
		subsequence(index+1 , ar , a , sum , k);
		
	}
	
	
	// only one subsequence with sum k
	static boolean subsequencesWithK(int index , ArrayList<Integer> ar ,int[] a , int k) {
		if(index >= a.length) {
			int s = 0;
			
			for(int x : ar)
				s += x;
			
			// condition satisfied
			if(s == k) {
				for(int x : ar)
					System.out.print(x + " ");
				System.out.println();
				return true;
			}
			
			// condition not satisfied
			return false;
		}
		
		ar.add(a[index]);
		
		// if we got answer here avoid future recursion calls.
		if(subsequencesWithK(index+1 , ar , a , k))
			return true;
		
		ar.remove(ar.size()-1);
		
		// if we got answer here, avoid future recursion calls. 
		if(subsequencesWithK(index+1 , ar , a , k) == true)
			return true;
		
		// if we didn't get it anywhere , return false.
		return false;
	}
}
