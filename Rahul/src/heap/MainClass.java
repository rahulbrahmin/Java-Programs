package heap;

public class MainClass {

	public static void main(String[] args) {
		MyHeap mh = new MyHeap();
		
		mh.insert(50);
		mh.insert(30);
		mh.insert(40);
		mh.insert(10);
		mh.insert(5);
		mh.insert(20);
		mh.insert(30);
		System.out.println(mh.size());
		mh.print();
//		mh.insert(60);
		mh.print();
		System.out.println(mh.delete());
		mh.insert(45);
		mh.print();
		
		System.out.println(mh.delete());
		System.out.println(mh.size());
		mh.print();
		
		
		
		
		
		
		
		
		
		
		
		
//		int a[] = { 50 , 30 , 40 , 10 , 5 , 20 , 30 };
//		print(a);
//		swap(a , 1 , 2);
//		print(a);
	}
	
	static void swap(int arr[] , int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	static void print(int a[]) {
		for(int i=0 ; i<a.length ; i++)
			System.out.print(a[i] + " ");
		
		System.out.println();
	}

}
