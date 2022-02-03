package sets;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3, 4, -1, 4, 3, -6, -7, 2};
		int n = a.length;
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		boolean found = false;
		
		for(int i=0; i<n ;i++) {
			set.add(sum);
			sum += a[i];
			
			if(set.contains(sum)) {
				found = true;
			}
		}
		System.out.println("Found " + found);

	}

}
