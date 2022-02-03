package arrays;

public class LargestSumSubarray {

	public static void main(String[] args) {
		int a[]= {1,4,-2,4,-1,3,5,-6};
		int n=a.length;
		
		int max=Integer.MIN_VALUE;                        /*Works on Karden's Algorithm */
		int cursum=0;                                         /*    Most Efficient way  */
		for(int i=0;i<n;i++) {
			cursum+=a[i];
			
			if(cursum>max)
				max=cursum;
			
			if(cursum<0)
				cursum=0;
		}
		
		System.out.println("Largest Sum Subarray is:  "+max);
		
		
		/*int sum[]=new int[n];
		sum[0]=a[0];
		
		int max=Integer.MIN_VALUE;
		
		for(int i=1;i<n;i++) {
			sum[i]=sum[i-1]+a[i];
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int cursum=sum[j]-sum[i]+a[i];
				if(cursum>max)
					max=cursum;
			}
		}
		
		System.out.println(max);     */
		
		
		
	 /*	int max=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int cursum=0;
				for(int k=i;k<=j;k++) {
					cursum+=a[k];
				}
				if(cursum>max)
					max=cursum;
			}
		}
		System.out.println("Largest sum Subarry is:  "+max);    */
	}

}
