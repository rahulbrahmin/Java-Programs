package queues;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
//		Queue<Integer> q = new LinkedList<>();
//		
//		q.add(12);
//		q.add(23);
//		q.add(36);
//		
//		System.out.println(q.size());
//		
//		q.offer(30);
//		System.out.println(q.element());
//		System.out.println(q.remove());
//		System.out.println(q.peek());
//		System.out.println(q.poll());
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enQueue(23);
		mq.enQueue(56);
		mq.enQueue(66);
		
		System.out.println(mq.deQueue());
		mq.print();
		System.out.println(mq.peek());
	}
}
