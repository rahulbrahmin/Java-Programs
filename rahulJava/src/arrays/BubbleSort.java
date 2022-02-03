package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {2,1,8,-3,6,4,12};
		int n=a.length;
		
		boolean sorted=true;
		
		for(int j=0;j<n-1;j++) {          //outer Loop
			for(int i=0;i<n-1-j;i++) {      //Inner Loop
				if(a[i]>a[i+1]) {
					int temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
					
					sorted=false;
				}
			}
			
			if(sorted)                   // if sorted , comes out of loop
				break;
		}
		System.out.println("Sorted array is:  ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println( );
		
		for(int item: a) {
			System.out.print(item+" ");
		}
	}
}
