package recursionNew;

public class factorial {

	public static void main(String[] args) {
		System.out.println(fact(4));
		
		factorial(4 , 1);
	}
	
	// functional
	static int fact(int n) {
		if(n == 1)
			return 1;
		
		return n * fact(n-1);
	}
	
	// parameterized
	
	static void factorial(int n , int prod) {
		if(n == 1) {
			System.out.println(prod);
			return;
		}
		
		factorial(n-1 , prod * n);
	}
}
