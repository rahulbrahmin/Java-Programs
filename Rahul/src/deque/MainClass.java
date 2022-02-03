package deque;

public class MainClass {

	public static void main(String[] args) {
		MyDeque md = new MyDeque();
		
//		System.out.println(md.removeFromHead());
//		System.out.println(md.removeFromTail());
		md.addToHead("Wah");
		md.addToHead("Rahul");
		md.addToHead(5);
		md.addToTail("Dj");
		md.addToTail("Dubey");
		md.addToTail(8);
		md.print();
		System.out.println(md.removeFromHead());
		md.print();
//		System.out.println(md.removeFromHead());
//		md.print();
		
		System.out.println(md.removeFromTail());
		md.print();
		System.out.println(md.removeFromTail());
		md.print();
		
//		md.removeFromHead();
//		md.removeFromTail();
//		md.print();
//		md.removeFromHead();
//		md.print();
//		System.out.println(md.removeFromHead());
//		System.out.println(md.removeFromTail());
		
		md.removeFromHead();
		md.removeFromTail();
		System.out.println(md.getHead());
		System.out.println(md.getTail());
	}

}
