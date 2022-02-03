package recursion;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dec(25);
		inc(25);
	}
	
	static void dec(int n) {
		if(n==1) {
			System.out.print(n + " ");
			System.out.println();
			return ;
		}
		
		System.out.print(n + " ");
		dec(n-1);
	}
	
	
	static void inc(int n) {
		if(n==1) {
			System.out.println();
			System.out.print(n + " ");
			return ;
		}
		
		inc(n-1);
		System.out.print(n + " ");
	}

}
