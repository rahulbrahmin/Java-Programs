package recursionNew;

import java.util.ArrayList;

public class SubsequencesOfArray {

	public static void main(String[] args) {
		int a[] = {3 , 1 , 2};
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		subsequences(0 , ar , a);
	}
	
	static void subsequences(int index , ArrayList<Integer> ar  ,int[] a) {
		if(index >= a.length) {
			for(int x : ar)
				System.out.print(x + " ");
			
			if(ar.size() == 0) {
				System.out.print("{ }");
			}
			
			System.out.println();
			return;
		}
		
		ar.add(a[index]);
		subsequences(index+1 , ar , a);
		
		ar.remove(ar.size()-1);
		subsequences(index+1 , ar , a);
	}
}
