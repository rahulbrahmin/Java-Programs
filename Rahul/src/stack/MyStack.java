package stack;

import linkedList.MyLinkedList;
import linkedList.MyLinkedList.Node;

public class MyStack<E> {
	
	private MyLinkedList<E> ll = new MyLinkedList<>();
	
	void push(E data) {
		ll.addFirst(data);
	}
	
	E pop() {
		E data = ll.removeFirst();
		return data;
	}
	
	E peek() {
		return ll.get(0);
	}
	
	boolean search(E data) {
		return ll.contains(data);
	}
	
	void empty() {
		ll.clear();
	}
	
	void print() {
		ll.print();
	}
}
