package recursion.advance;

import java.util.HashSet;
import java.util.Set;

public class Permutations {
	
	static Set<String> st = new HashSet<>();   // to remove duplicacy.
 
	public static void main(String[] args) {
		permutations("abc" , 0 , 2);
	}
	
	static void permutations(String s , int l , int r) {
		if(l==r) {
			if(st.contains(s))
				return;
			
			st.add(s);
			System.out.println(s);
			return ;
		}
		
		for(int i=l ; i<=r ; i++) {
			s = interchange(s , l , i);
			permutations(s , l+1 , r);
			s = interchange(s , l , i);         // String fir se thk krne ke liye.
		}
		
	}
	
	static String interchange(String s , int a , int b) {
		char[] arr = s.toCharArray();
		
		char c = arr[a];
		arr[a] = arr[b];
		arr[b] = c;
		
		return String.valueOf(arr);
	}

}
