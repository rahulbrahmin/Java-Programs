package chegg;

public class LinkedList<T> implements List<T> {

	Node<T> head;
	@Override
	public boolean empty() {
		if(head == null)
			return true;
		
		return false;
	}

	@Override
	public boolean full() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void findFirst() {
		
	}

	@Override
	public void findNext() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean last() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T retrieve() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Object e) {
		Node<T> toAdd = new Node(e);
		 if(head == null) {
			 head = toAdd;
			 return;
		 }
		 
		 Node<T> temp = head;
		 while(temp.next != null) {
			 temp = temp.next;
		 }
		 
		 temp.next = toAdd;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	public static class Node<T>{
		T data;
		Node<T> next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	
}
