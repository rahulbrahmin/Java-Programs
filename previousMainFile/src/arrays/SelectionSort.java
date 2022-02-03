package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {3,1,-2,7,4,0};
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {   
			int min=i;                     //Minimum index always initialize with new iteration
			for(int j=i;j<n;j++) {         //loop from right to left
				if(a[min]>a[j])
					min=j;                 //for swapping
			}
			int temp=a[min];
			a[min]=a[i];                 //swap with minimum value
			a[i]=temp;
		}
		
		System.out.println("Sorted array is");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		for(int item: a)
			System.out.print(item+" ");

	}

}
