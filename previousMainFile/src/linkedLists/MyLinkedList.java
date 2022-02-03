package linkedLists;

public class MyLinkedList<E> {
	Node<E> head;
	
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if(isEmpty()) {
			head = toAdd;
			return ;
		}
		
		Node<E> temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = toAdd;
	}
	
	public void print() {
		Node<E> temp = head;
		
		System.out.print("[ ");
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print("]");
		System.out.println();
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	E get(int index) {
		Node<E> temp = head;
		
		if(index<0 || index>=size()) {
			System.out.println("Index out of bound exception");
			//return null;
		}
		
		for(int i=0;i<size();i++) {
			if(i == index)
				return temp.data;
			temp = temp.next;
		}
		return null;
	}
	
	public int size() {
		int count = 0;
		
		if(head == null)
			return -1;
		
		Node<E> temp = head;
		
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	void set(int index , E value) {
		if(index < 0 || index >=size()) {
			System.out.println("Index out of bound exception");
		}
		
		Node<E> temp = head;
		
		for(int i=0;i<size();i++) {
			if(i == index)
				temp.data = value;
			temp = temp.next;
		}
	}
	
	E remove(int index) {
		if(index < 0 || index >=size())
			System.out.println("Index out of bound exception");
		
		Node<E> temp = head;
		E res = null;
		
		for(int i=0;i<size();i++) {
			if(i == index) {
				res = temp.data;
				temp.data = null;
			}
			temp = temp.next;
		}
		return res;
	}
	
	public E removeLast() throws Exception {
		if(isEmpty()) {
			throw new Exception("Can't remove from empty list");
		}
		
		Node<E> temp = head;
		
		while(temp.next.next != null)
			temp = temp.next;
		
		E removed = temp.next.data;
		
		temp.next = null;
		
		return removed;
	}
	
	public E getLast() throws Exception {
		if(isEmpty()) {
			throw new Exception("List is empty");
		}
		
		Node<E> temp = head;
		
		while(temp.next != null)
			temp = temp.next;
		
		E last = temp.data;
		
		return last;
	}
	
//	private Exception Exception(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	void removeAll() {
		Node<E> temp = head;
		
		for(int i=0;i<size();i++) {
			temp.data = null;
			
			temp = temp.next;
		}
	}
	
	boolean contains(E data) {
		Node<E> temp = head;
		
		while(temp != null) {
			
			if(temp.data == data)
				return true;
			
			temp = temp.next;
		}
		
		return false;
	}
	
	public static class  Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
}
