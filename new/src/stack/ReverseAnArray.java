package stack;

public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[] = {1 , 2 , 3 , 4 , 2 };
		
//		reverse(arr , arr.length , 0);
		
		reverseArray(arr , 0 , arr.length - 1);
		
		for(int i : arr)
			System.out.print(i + " ");
	}
	
	// Reversing original array using two pointers.
	
	static void reverseArray(int a[] , int l , int r) {
		if(l >= r)
			return;
		
		swap(a , l , r);
		
		reverseArray(a , l+1 , r-1);
	}
	
	// Printing in reverse manner
	static void reverse(int a[] , int n , int i) {
		if(n == 0)
			return;
		
		reverse(a , n-1 , i+1);
		
		System.out.print(a[i] + " ");
	}
	
	static void swap(int a[] , int i , int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
