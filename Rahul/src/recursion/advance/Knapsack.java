package recursion.advance;

public class Knapsack {

	public static void main(String[] args) {
		
		int val[] = {100 , 50 , 150 , 110};
		int wt[] = {10 , 20 , 30 , 20};
		
		System.out.println(knapsack(val , wt , val.length , 60));
	}
	
	static int knapsack(int val[] , int wt[] , int n , int w) {
		if(n==0 || w==0)
			return 0;
		
		if(wt[n-1] > w)
			return knapsack(val , wt , n-1 , w);
		
		return Math.max(knapsack(val , wt , n-1 , w-wt[n-1])+val[n-1] , knapsack(val , wt , n-1 , w));
		
	}
}
