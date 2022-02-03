package chegg;

public class LinkedStack<E> {
	
    Node<E> head;
	
 // method to check two linked stacks are equal or not without using any LinkedStack class method
	    boolean isEqual(LinkedStack s) {
        boolean flag = true;
		
		int count1 = 0;                                             // to count size of first Linkedstack
		
		if(head == null)
			count1 = -1;
		else {
			Node<E> temp1 = head;
			
			while(temp1 != null) {
				count1++;
				temp1 = temp1.next;
			}
		}
		
        int count2 = 0;                                        // to count size of second Linkedstack
		
		if(s.head == null)
			count2 = -1;
		else {
			Node<E> temp2 = s.head;
			
			while(temp2 != null) {
				count2++;
				temp2 = temp2.next;
			}
		}
		
		if(count1 != count2) {
			return false;
		}
		
        while(head != null) {
			
			if(head.data == s.head.data) {
				
				head = head.next;                                       // pop from 1st Linkedstack       
				
				s.head = s.head.next;                                  // // pop from 2nd Linkedstack
				
			}else {
				flag = false;
				break;
			}
		}
		
		return flag;
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
	
	void push(E data) {
        Node<E> toAdd = new Node<E>(data);
		
		if(isEmpty()) {
			head = toAdd;
			return ;
		}
		
		Node<E> temp = head;
		
		temp.data = data;
		
		temp.next = toAdd;
		
		head = temp;
	}
	
	E pop() {
		if(isEmpty()) {
			return null;
		}
		
		E removed = head.data;
		
		head = head.next;
		
		return removed;
	}
	
     static class  Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		
        LinkedStack<Integer> s1 = new LinkedStack<>();
		
		s1.push(5);
		s1.push(25);
		s1.push(65);
		s1.push(25);
		s1.push(35);
		
		LinkedStack<Integer> s2 = new LinkedStack<>();
		
		s2.push(5);
		s2.push(25);
		s2.push(65);
		s2.push(25);
		s2.push(35);
		
		System.out.println(s1.isEqual(s2));
		
		LinkedStack<Integer> s3 = new LinkedStack<>();
		
		s3.push(65);
		s3.push(45);
		s3.push(26);
		s3.push(85);
		s3.push(15);
		
        LinkedStack<Integer> s4 = new LinkedStack<>();
		
		s4.push(62);
		s4.push(16);
		s4.push(75);
		s4.push(23);
		s4.push(42);
		s4.push(32);
		
		System.out.println(s3.isEqual(s4));

	}

}
