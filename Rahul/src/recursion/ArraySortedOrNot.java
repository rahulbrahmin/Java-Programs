package recursion;

public class ArraySortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1 , 2 , 4 , 5};
		System.out.println(isSorted(a , a.length));
	}
	
	static boolean isSorted(int a[] , int n) {
		if(n==0 || n==1)
			return true;
		
		return (a[n-2] <= a[n-1] && isSorted(a , n-1));
	}
}
