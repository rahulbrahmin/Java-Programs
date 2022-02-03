package linkedLists;

public class SegregateList {
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	Node head;
	
	public void add(int data) {
		Node toAdd  = new Node(data);
		
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
	
	public void segregateEvenOdd() {
		Node temp = head;
		
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		temp = head;
		
		SegregateList even = new SegregateList();
		SegregateList odd = new SegregateList();
		
		while(temp != null) {
			if(temp.data % 2 == 0) 
				even.add(temp.data);
			
			else if(temp.data % 2 != 0)
				odd.add(temp.data);
			
			temp = temp.next;
		}
		
		while(even.head != null) {
			System.out.print(even.head.data + " ");
			even.head = even.head.next;
		}
		
		while(odd.head != null) {
			System.out.print(odd.head.data + " ");
			odd.head = odd.head.next;
		}
	}
	
//	void print() {
//		Node temp = head;
//		while(temp != null) {
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SegregateList s = new SegregateList();
		
		s.add(17);
		s.add(15);
		s.add(8);
		s.add(9);
		s.add(2);
		s.add(4);
		s.add(6);
		
		s.segregateEvenOdd();
		
		//s.print();
	}

}
