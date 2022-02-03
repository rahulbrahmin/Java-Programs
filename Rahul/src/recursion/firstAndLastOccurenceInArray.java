package recursion;

public class firstAndLastOccurenceInArray {

	public static void main(String[] args) {
		int a[] = {4,2,1,2,5,2,7};
		
		System.out.println(firstOcc(a , a.length , 0 , 2));
		System.out.println(lastOcc(a , a.length , 0 , 2));

	}
	
	static int firstOcc(int a[] , int n , int i , int key) {
		if(i==n)
			return -1;
		
		if(a[i] == key)
			return i;
		
		return firstOcc(a , n , i+1 , key);
	}
	
	static int lastOcc(int a[] , int n , int i , int key) {
		if(i==n)
			return -1;
		
		int restArray = lastOcc(a , n , i+1 , key);
		if(restArray != -1)
			return restArray;
		
		if(a[i] == key)
			return i;
		
		return -1;
	}

}
