package queues;

import linkedLists.MyLinkedList.Node;

public class MyQueue<E> {
	Node<E> head , rear;
	
	public void enQueue(E e) {
		Node<E> toAdd = new Node(e);
		
		if(head == null) {
			head = rear = toAdd;
			return;
		}
		
		rear.next = toAdd;
		rear = rear.next;
		
	}
	
	public E deQueue() {
		if(head == null)
			return null;
		Node<E> temp = head;
		head = head.next;
		
		if(head == null)
			rear = null;
		
		return temp.data;
	}
	
	public void print() {
		if(head == null)
			System.out.println("Cannot print an empty queue");
		else {
		Node<E> temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		}
	}
	
	public E peek() {
		if(head == null)
			return null;
		else
			return head.data;
	}
}
