package recursionNew;

public class SumOfFirstN {

	public static void main(String[] args) {
		//sum(10 , 0);
		
		System.out.println(sum(10));
	}
	
	/*  parameterized way
	static void sum(int n , int sum) {
		if(n < 0) {
			System.out.println(sum);
			return;
		}
		
		sum(n-1 , sum + n);
	}
	*/
	
	// Functional way
	
	static int sum(int n) {
		if(n == 0)
			return 0;
		
		return n + sum(n-1);
	}
}
