package linkedList;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList<>();
		ll.addFirst("Jagarnath");
		ll.add("Rahul");
		ll.add(5);
		ll.add("Dubey");
		ll.add(4.5);
		ll.add("Wah");
		
		ll.print();
//		System.out.println(ll.size());
//		System.out.println(ll.get(3));
		
//		ll.set(4, "Rowdy");
//		ll.print();
		
//		ll.remove(3);
//		ll.print();
		
//		ll.clear();
//		ll.print();
		
		System.out.println(ll.contains("Wah"));
		System.out.println(ll.removeFirst());
		ll.print();
		ll.addFirst("Rahul");
		ll.print();
		
//		List<String> ls = new LinkedList<>();
//		ls.add("Rahul");
//		ls.add("Dj baba");
//		
//		System.out.println(ls.get(1));
	}
	
}
