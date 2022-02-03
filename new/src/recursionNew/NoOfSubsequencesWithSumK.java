package recursionNew;

public class NoOfSubsequencesWithSumK {

	public static void main(String[] args) {
		
		int a[] = {1,2,1};
		
		System.out.println(subs(0 , a , 0 , 2));
	}
	
	static int subs(int i , int[] a, int s , int k) {
		// one more base case to reduce complexity
		
		// this works only when all elements of array are strictly positive.
		if(s > k) {
			return 0;
		}
		
		// base case
		if(i >= a.length) {
			
			// base case satisfied
			if(s == k) {
				return 1;
			}
			
			// base case not satisfied.
			return 0;
		}
		
		s += a[i];
		
		int left = subs(i+1 , a , s , k);
	
		s -= a[i];
		
		int right = subs(i+1 , a , s , k);
		
		return (left + right);
	}
}
