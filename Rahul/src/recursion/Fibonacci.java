package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(15));
	}
	
	static long fibonacci(int n) {
		if(n==0 || n==1)
			return n;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
