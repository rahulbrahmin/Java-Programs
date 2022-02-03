package arrays;

public class MedianOfTwoSortedArraysOfSameSize {

	public static void main(String[] args) {
		int a1[] = {1 , 2 , 6 , 12 , 13};
		int a2[] = {4 , 6 , 10 , 14 , 18};
		
//		int a1[] = { 1, 2, 3, 3 };
//        int a2[] = { 4, 6, 8, 10 };
		
//		int a1[] = {1,12,15,26,38};
//		int a2[] = {2,13,17,30,45};
		
		
		/*   O(n) approach     */
		
		int n = a1.length;
		
		int m1 = -1;
		int m2 = -1;
		
		int count = 0;
		int i = 0;
		int j = 0;
		
		while(i<=n || j<=n) {
			
			if(i==n-1) {
				m1 = a1[i];
				m2 = a2[0];
				break;
			}
			
			if(j==n-1) {
				m1 = a2[j];
				m2 = a1[0];
				break;
			}
			if(count > n)
				break;
			
			m1 = m2;
			m2 = Math.min(a1[i], a2[j]);
			
			if(a1[i] <= a2[j]) {
				i++;
				count++;
			}else if(a1[i] >= a2[j]) {
				j++;
				count++;
			}
		}
		
		System.out.println("Median of both arrays in O(n) is:  " + (m1 + m2) / 2);
		
		/* ------------------------------------------------------------------------*/
		
		System.out.println("Using recursion Median of both the arrays in O(logn) is:  "
				+ median(a1 , a2 , 0 , a1.length-1 , 0 , a2.length-1));
	}
	
	static int fmedian(int a[] , int s , int e) {
		return (a[(s+e)/2] + a[(s+e+1)/2] )/2;
	}
	
	static int median(int a[] , int b[] , int sa , int ea , int sb , int eb) {
		
		// if size of subarrays passed are two only
		if((ea - sa) <= 1) {
			return (Math.max(a[sa], b[sb]) + Math.min(a[ea], b[eb])) / 2;
		}
		
		int m1 = fmedian(a , sa , ea);
		int m2 = fmedian(b , sb , eb);
		
		if(m1 == m2)
			return m1;
		
		if(m1 > m2)
			return median(a , b , sa , (sa + ea )/2 , (sb + eb )/2 , eb);
			
		return median(a , b , (sa + ea )/2 , ea , sb , (sb + eb )/2);
		
		
	}

}
