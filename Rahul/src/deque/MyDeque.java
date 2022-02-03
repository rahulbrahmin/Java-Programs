package deque;

public class MyDeque<E> {
	Node<E> head , tail;
	
	void addToHead(E data) {
		Node toAdd = new Node(data);
		if(head == null) {
			head = tail = toAdd;
			return ;
		}
		
		toAdd.next = head;
		head.prev = toAdd;
		head = toAdd;
		
	}
	
	void addToTail(E data) {
		Node toAdd = new Node(data);
		
		if(head == null) {
			head = tail = toAdd;
			return ;
		}
		
		toAdd.prev = tail;
		tail.next = toAdd;
		tail = toAdd;
	}
	
	void print() {
		if(head == null) {
			System.out.println("Deque is Empty.");
			return;
		}
		Node temp = head;
		
		System.out.print("[ ");
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print("]");
		System.out.println();
	}
	
	E removeFromHead() {
		if(head == null) {
			return null;
		}
		
		E temp = (E) head.data;
		if(head == tail) {
			head = tail = null;
			return temp;
		}
		
		head = head.next;
		head.prev = null;
		return temp;
	}
	
	E removeFromTail() {
		if(head == null) {
			return null;
		}
		
		E temp = tail.data;
		if(head == tail) {
			head = tail = null;
			return temp;
		}
		
		tail = tail.prev;
		tail.next = null;
		return temp;
	}
	
	E getHead() {
		return head.data;
	}
	
	E getTail() {
		return tail.data;
	}
	
	public class Node<E>{
		E data;
		Node prev , next;
		
		public Node(E data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
}
