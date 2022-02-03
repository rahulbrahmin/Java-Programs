package queue;

import java.util.*;

public class QueueUsingStack<E> {
	
	Stack<E> st1 = new Stack();
	Stack<E> st2 = new Stack<>();
	
	void add(E data) {
		st1.push(data);
	}
	
	E remove() {
		while(! st1.isEmpty())
			st2.push(st1.pop());
		
		E temp = st2.pop();
		
		while(! st2.isEmpty())
			st1.push(st2.pop());
		
		return temp;
	}
	
	void print() {
		while(!st1.isEmpty()) {
			st2.push(st1.pop());
		}
		
		System.out.print("[ ");
		while(!st2.isEmpty()) {
			E data = st2.pop();
			st1.push(data);
			
			System.out.print(data + " , ");
		}
		
		System.out.print(" ]");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		QueueUsingStack q = new QueueUsingStack();
		
		q.add("rahul");
		q.add(65);
		q.add(95);
		q.add("Dj");
		
		q.print();
		
		System.out.println(q.remove());
		q.print();
		
		q.add("Hono lulu");
		q.print();
	}

}
