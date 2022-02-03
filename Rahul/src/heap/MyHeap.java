package heap;

public class MyHeap {
	int heapSize = 16;
	
	int heap[] = new int[heapSize];
	
	int n=0;
	
	int size() {
		if(n==0) {
			System.out.println("Heap is empty");
			return -1;
		}
		return n;
	}
	
	void print() {
		
		if(n==0) {
			System.out.println("Heap is empty");
			return;
		}	
		
		System.out.print("[ ");
		for(int i=1 ; i<=n ; i++) {
			if(i==n)
				System.out.print(heap[i] + " ]");
			else
				System.out.print(heap[i] + " , ");
		}
		
		System.out.println();
	}
	
	void insert(int data) {
		n++;
		heap[n] = data;
		
		int i = n;
		
		while(i > 1) {
			int parent = i/2;
			
			if(heap[parent] < data) {
				swap(heap , parent , i);
				i = parent;
			}else
				return;
		}
		
		
	}
	
	int delete() {
		if(n==0) {
			System.out.println("Can't delete from an empty heap.");
			return -1;
		}
		
		int data = heap[1];
		
		heap[1] = heap[n];
		n--;
		
		int i = 1;
		
		while(i<n) {
			int left = heap[2*i];
			int right = heap[(2*i)+1];
			
			if((2*i)>n || ((2*i)+1)>n) {
				return data;
			}
			
			int larger = (left>right) ? 2*i : (2*i)+1;
			
			if(heap[i]<heap[larger]) {
				swap(heap , i , larger);
				i = larger;
			}else
				return data;
		}
		
		return data;
	}
	
	void swap(int arr[] , int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
