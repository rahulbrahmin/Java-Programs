package deque;

public class MainClass {

	public static void main(String[] args) {
		
		MyDeque<Integer> md = new MyDeque<>();
		
		md.addAtFront(20);
		md.addAtFront(10);
		md.addAtRear(30);
		md.addAtRear(40);
		
		md.viewDeque();
//		System.out.println(md.getFront());
//		System.out.println(md.getLast());
		
		System.out.println(md.removeFront());
		System.out.println(md.removeRear());
//		System.out.println(md.removeRear());
//		System.out.println(md.getFront());
//		System.out.println(md.getLast());
//		System.out.println(md.removeRear());
//		System.out.println(md.removeFront());
//		System.out.println(md.removeFront());
//		System.out.println(md.removeRear());
		md.viewDeque();
	}

}
