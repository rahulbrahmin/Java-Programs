package recursion.advance;

public class Tiling {

	public static void main(String[] args) {
		
		System.out.println(tiling(4));

	}
	
	static int tiling(int n) {
		if(n==0)
			return 0;
		
		if(n==1)
			return 1;
		
		return tiling(n-1) + tiling(n-2);  // n-1 vertical ke liye , n-2 horizontal ke liye
	}

}
