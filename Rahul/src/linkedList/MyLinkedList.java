package linkedList;

import java.util.List;

public class MyLinkedList<E> {
	Node<E> head;
	
	public void add(E data) {
		Node toAdd = new Node(data);
		if(head == null) {
			head = toAdd;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	public void addFirst(E data) {
		Node toAdd = new Node(data);
		
		toAdd.next = head;
		head = toAdd;
	}
	
//	void addAll(List<E> list) {
//		if(list.isEmpty()) {
//			System.out.println("List is Empty");
//			return;
//		}
//		Node temp = head;
//		
//		for(int i=0 ; i<list.size() ; i++) {
//			temp.add(list.get(i));
//		}
//	}
	
	public E get(int index) {
		int count = 0;
		Node temp = head;
		if(index<0 || index>=size()){
			System.out.println("Invalid Index");
			return null;
		}
		while(temp != null) {
			if(count == index)
				return (E) temp.data;
			count++;
			temp = temp.next;
		}
		return null;
	}
	
	void set(int index , E data) {
		if(index<0 || index>size()) {
			System.out.println("Invalid Index");
			return;
		}
		
		Node toAdd = new Node(data);
		Node temp = head;
		
		if(index == 0) {
			toAdd.next = head;
			head = toAdd;
		}
		
		int count = 0;
		while(temp != null) {
			if(count == index-1) {
				toAdd.next = temp.next;
				temp.next = toAdd;
			}
			temp = temp.next;
			count++;
		}
	}
	
	public E removeFirst() {
		if(head == null) {
			System.out.println("List is Empty");
			return null;
		}
		
		E data = head.data;
		head = head.next;
		
		return data;
	}
	
	public E remove(int index) {
		if(head == null) {
			System.out.println("List is Empty");
			return null;
		}
		
		Node temp = head;
		if(index<0 || index>size()) {
			System.out.println("Invalid Index");
			return null;
		}
		
		if(index == 0) {
			E data = head.data;
			head = head.next;
			return data;
		}
		int count = 0;
		while(temp != null) {
			if(count == index-1) {
				E data = (E) temp.next.data;
				temp.next = temp.next.next;
				return data;
			}
			temp = temp.next;
			count++;
		}
		return null;
	}
	
	public void clear() {
		head = null;
	}
	
	public boolean contains(E data) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == data)
				return true;
			temp = temp.next;
		}
		return false;
	}
	
	int size() {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("List is Empty.");
			return;
		}
		System.out.print("[ ");
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
		System.out.println("]");
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	
	
	public static class Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data){
			this.data = data;
			this.next = null;
		}
	}
}
