package arrays;

public class SmallestSubarrayWithSumGreaterThanX {

	public static void main(String[] args) {
		int arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
		int x = 280;
		
//		int min = 0;
//		
//		for(int i=0 ; i<arr.length ; i++) {
//			int sum = 0;
//			int count = 0;
//			for(int j=i ; j<arr.length ; j++) {
//				sum += arr[j];
//				count++;
//				
//				if(sum > x) {
//					min = Math.min(min, count);
//					break;
//				}
//			}
//			
//		}
		
		int min = Integer.MAX_VALUE;
		int i=0;
		int j=0;
		int sum=0;
		
		while(i<=j && j<arr.length) {
			while(sum <= x && j<arr.length) {
				sum += arr[j++];
			}
			
			while(sum > x && i < j) {
				min = Math.min(min, j-i);
				sum -= arr[i++];
			}
		}
		
		System.out.println(min);
	}

}
