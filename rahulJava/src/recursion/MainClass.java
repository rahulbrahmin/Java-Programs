package recursion;

public class MainClass {
	static int stepCount = 0;

	public static void main(String[] args) {
		
		System.out.println(sum(15));
		//System.out.println(pow(2 , 10000));
//		System.out.println(fastPow(2 , 10));
//		System.out.println(stepCount);
		
		System.out.println(path(20000 , 1));
	}
	
	static int sum(int n) {
		if(n==1)
			return 1;
		
		return n + sum(n-1);
	}
	
	static int pow(int a , int b) {
		stepCount++;
		if(b==0)
			return 1;
		
		return a * pow(a , b-1);
	}
	
	static int fastPow(int a , int b) {
		stepCount++;
		if(b==0) return 1;
		
		else if(b%2 == 0) {
			return fastPow(a*a , b/2);
		}
		
		return a * fastPow(a , b - 1);
	}
	
	static int path(int n , int m) {
		if(n==1 || m==1)
			return 1;
		
		return path(n , m-1) + path(m , n-1);
	}
}
