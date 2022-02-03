package recursionNew;

import java.util.*;

public class PermutationsOfArray {

	public static void main(String[] args) {
		int a[] = {1 , 2 , 3};
		
		List<List<Integer>> ar = new ArrayList<>();
		
		permutation(a , a.length , 0 , ar);
		
		for(List x : ar)
			System.out.println(x);
	}
	
	public static void permutation(int[] a , int n , int ind , List<List<Integer>> ar) {
		
		if(ind == n) {
			List<Integer> temp = new ArrayList<>();
			
			for(int i=0 ; i<n ; i++)
				temp.add(a[i]);
			
			ar.add(new ArrayList<>(temp));
			
			return;
		}
		
		for(int i=ind ; i<n ; i++) { 
			swap(a , ind , i);
			
			permutation(a , n , ind+1 , ar);
			
			swap(a , ind , i);
		}
	}
	
	public static void swap(int[] a , int i , int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
