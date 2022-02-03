package queue;

import java.util.*;

public class StackUsingQueue<E> {

	Queue<E> q1 = new ArrayDeque<>();
	Queue<E> q2 = new ArrayDeque<>();
	
	public void add(E data) {
		while(!q1.isEmpty())
			q2.offer(q1.poll());
		
		q1.offer(data);
		
		while(!q2.isEmpty())
			q1.offer(q2.poll());
	}
	
	public E remove() {
		return q1.poll();
	}
	
	public void print() {
		while(!q1.isEmpty())
			q2.offer(q1.poll());
		
		while(!q2.isEmpty()) {
			E data = q2.poll();
			q1.offer(data);
			System.out.print(data + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		StackUsingQueue st = new StackUsingQueue();
		
		st.add(54);
		st.add("Rahul");
		st.add(95);
		
		st.print();
		
		System.out.println(st.remove());
	}

}
