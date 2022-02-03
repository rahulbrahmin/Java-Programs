package stacks;

import linkedLists.MyLinkedList;
import linkedLists.MyLinkedList.Node;

public class LinkedStack<E> { 
	Node head;
	
	private MyLinkedList<E> ll = new MyLinkedList<>();
	
	
	// method to check two linked stacks are equal or not without using any LinkedStack class function
	    static boolean isEqual(LinkedStack s1 , LinkedStack s2) {                    // Required method to check to LinkedStacks are equal or not
		boolean flag = true;
		
		int count1 = 0;                                             // to count size of first Linkedstack
		
		if(s1.head == null)
			count1 = -1;
		else {
			Node temp1 = s1.head;
			
			while(temp1 != null) {
				count1++;
				temp1 = temp1.next;
			}
		}
		
		int count2 = 0;                                        // to count size of second Linkedstack
		
		if(s2.head == null)
			count2 = -1;
		else {
			Node temp2 = s2.head;
			
			while(temp2 != null) {
				count2++;
				temp2 = temp2.next;
			}
		}
		
		if(count1 != count2) {
			return false;
		}
		
		
		while(s1.head != null) {
			
			if(s1.head.data == s2.head.data) {
				
				Node temp1 = s1.head;
				
				while(temp1.next.next != null) {                          // pop from 1st Linkedstack
					temp1 = temp1.next;
				}
				temp1.next = null;
				
				Node temp2 = s2.head;
				
				while(temp2.next.next != null) {                        // pop from 1st Linkedstack     
					temp2 = temp2.next;
				}
				temp2.next = null;
				
			}else {
				flag = false;
				break;
			}
		}
		
		return flag;
		
	}
	
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
	
	int size() {
		return ll.size();
	}
	
	void print() {
		ll.print();
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
		
		System.out.println(isEqual(s1, s2));
		
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
		
		System.out.println(isEqual(s3 , s4));
	}
}

