package queue;

public class ArrayQueue {
	int[] ar;
	int capacity;
	int rear = -1;
	
	public ArrayQueue(int capacity) {
		ar = new int[capacity];
	}
	
	public void offer(int data) {
		if(this.rear >= this.ar.length) {
			System.out.println("Queue is full , Overflow!");
			return;
		}
		
		rear++;
		ar[rear] = data;
	}
	
	public int poll() {
		if(rear == -1) {
			System.out.println("Queue is already empty , Underflow!");
			return (Integer) null;
		}
		
		int temp = ar[0];
		
		for(int i=0 ; i<rear ; i++) {
			ar[i] = ar[i+1];
		}
		
		rear--;
		
		return temp;
	}
	
	public int peek() {
		if(rear == -1) {
			System.out.println("Queue is empty , Underflow!");
			return (Integer) null;
		}
		
		return ar[0];
	}
	
	public void print() {
		if(rear == -1) {
			System.out.println("Queue is empty.");
			return;
		}
		
		System.out.print("[ ");
		for(int i=0 ; i<= rear ; i++) {
			if(i != rear)
				System.out.print(ar[i] + " , ");
			else
				System.out.print(ar[i]);
		}
		
		System.out.print(" ]");
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayQueue q = new ArrayQueue(5);
		
		q.offer(15);
		q.offer(25);
		q.offer(45);
		q.offer(65);
		q.offer(85);
		
		q.print();
		
		System.out.println(q.peek());
		System.out.println(q.poll());
		q.print();
		System.out.println(q.poll());
		q.print();
		
		q.offer(95);
		q.print();
	}

}
