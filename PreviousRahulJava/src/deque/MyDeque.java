/* Implentation of Deque using LinkeList.   */

package deque;

public class MyDeque<E> {
	
	Node<E> front ;
	Node<E> rear ;
	
	void addAtFront(E data) {
		Node<E> toAdd = new Node<>(data);
		
		if(front == null) {
			front = rear = toAdd;
			return ;
		}
		
		front.prev = toAdd;
		toAdd.next = front;
		front = toAdd;
	}
	
	void addAtRear(E data) {
		Node<E> toAdd = new Node(data);
		
		if(front == null) {
			front = rear = toAdd;
			return ;
		}
		
		rear.next = toAdd;
		toAdd.prev = rear;
		rear = toAdd;
	}
	
	E removeFront() {
		if(front == null) {
			return null;
		}
		
		if(front.next == null ) {
			Node<E> temp = front;
			front = null;
			return temp.data;
		}
		
		E toRemove = front.data;
		front = front.next;
		front.prev = null;
		
		if(front == null) {
			rear = null;
		}
		
		return toRemove;
	}
	
	E removeRear() {
		if(front == null) {
			return null;
		}
		
		if(rear.prev == null) {
			Node<E> temp = rear;
			rear = null;
			return temp.data;
		}
		
		E toRemove = rear.data;
		Node<E> temp = rear.prev;
		temp.next = null;
		rear = temp;
		
		if(rear == null) {
			front = null;
		}
		
		return toRemove;
	}
	
	E getFront() {
		if(front == null) {
			return null;
		}
		
		return front.data;
	}
	
	E getLast() {
		if(front == null) {
			return null;
		}
		
		return rear.data;
	}
	
	void viewDeque() {
		if(front == null ) {
			System.out.println("Deque is empty");
			return ;
		}
		
		Node<E> temp = front;
		
		if(front == rear) {
			System.out.println("[ " + front.data + " ]");
			return ;
		}
		
		System.out.print("[ ");
		while(temp.next != null) {
			System.out.print(temp.data + " , ");
			temp = temp.next;
		}
		
		System.out.print(rear.data + " ]");
		
		System.out.println();
	}
	
	class Node<E>{
		E data;
		Node<E> prev , next;
		
		public Node(E data) {
			this.data = data;
			prev = null;
			next = null;
		}
	}
}
