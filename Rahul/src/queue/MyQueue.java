package queue;

import linkedList.MyLinkedList.Node;

public class MyQueue<E> {
	Node<E> head , rear;
	
	void enQueue(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = rear = toAdd;
			return;
		}
		rear.next = toAdd;
		rear = rear.next;
	}
	
	E deQueue() {
		if(head == null) {
			return null;
		}
		E data = head.data;
		if(head == rear) {
			head = null;
			rear = null;
			return data;
		}
		head = head.next;
		return data;
	}
	
	void print() {
		Node temp = head;
		if(head == null) {
			System.out.println("Queue is Empty");
			return;
		}
		
		System.out.print("[ ");
		while(temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
		System.out.print("]");
		System.out.println( );
	}
	
	E getHead() {
		if(head == null)
			return null;
		
		return head.data;
	}
	
	E getRear() {
		if(head == null)
			return null;
		
		return rear.data;
	}
}
