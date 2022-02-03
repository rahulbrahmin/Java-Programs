package queue;

public class CircularArrayQueue<E> {

	E[] ar;
	int capacity;
	int front;
	int rear;
	
	public CircularArrayQueue(int capacity) {
		this.capacity = capacity;
		ar = (E[]) new Object[this.capacity];
		
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isEmpty() {
		return (front == -1);
	}
	
	public boolean isFull() {
		return (front == (rear + 1) % this.ar.length);
	}
	
	public void offer(E data) {
		if(this.isFull()) {
			System.out.println("Overflow , Queue is already full");
			return;
		}
		
		// Queue is empty initially
		if(front == -1)
			front = 0;
		
		rear = (rear + 1) % ar.length;
		
		ar[rear] = data;
	}
	
	public E poll() {
		if(this.isEmpty()) {
			System.out.println("Underflow , Queue is empty.");
			return null;
		}
		
		E temp = ar[front];
		
		// only one element in queue
		if(front == rear) {
			front = rear = -1;
		}
		
		front = (front + 1) % ar.length;
		
		return temp;
	}
	
	public E getFront() {
		if(front == -1)
			return null;
		
		return ar[front];
	}
	
	public E getRear() {
		if(rear == -1)
			return null;
		
		return ar[rear];
	}
	
//	public void print() {
//		for(int i=(front+1)%ar.length-1 ; i<=(rear+1)%ar.length-1 ; i++)
//			System.out.print(ar[i] + " ");
//		
//		System.out.println();
//	}
	
	public static void main(String[] args) {
		CircularArrayQueue q = new CircularArrayQueue(5);
		
		q.offer("Rahul");
		q.offer(65);
		q.offer(85.26);
		q.offer("Dj");
		q.offer(45);
		
//		q.print();
		
		System.out.println(q.getFront());
		System.out.println(q.getRear());
		
		System.out.println(q.poll());
		System.out.println(q.getFront());
	}

}
