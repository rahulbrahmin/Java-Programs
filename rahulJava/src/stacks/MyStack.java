package stacks;

import linkedLists.MyLinkedList;
import linkedLists.MyLinkedList.Node;

public class MyStack<E> { 
	Node head;
	
	private MyLinkedList<E> ll = new MyLinkedList<>();
	
	void push(E e) {
		ll.add(e);
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty list is not allowed");
		}
		
		E removed = ll.removeLast();
		
		return removed;
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Cant get peek element from empty stack");
		}
		
		E peek = ll.getLast();
		
		return peek;
	}
	
	void print() {
		ll.print();
	}
}
