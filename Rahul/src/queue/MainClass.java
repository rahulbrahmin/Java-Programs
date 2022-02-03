package queue;

public class MainClass {

	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.enQueue("Rahul");
		mq.enQueue("Bhardwaj");
		mq.enQueue(5);
		mq.print();
		
//		System.out.println(mq.deQueue());
//		mq.print();
//		System.out.println(mq.deQueue());
//		System.out.println(mq.deQueue());
//		mq.print();
//		System.out.println(mq.deQueue());
		
		System.out.println(mq.getHead());
		System.out.println(mq.getRear());
	}

}
