package collections;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList<>();
		
		ar.add(5);
		ar.add("piddi");
		ar.add(3.5);
		
		System.out.println(ar);
		System.out.println(ar.get(2));
		System.out.println(ar.contains("piddi"));
		System.out.println(ar.size());
		
		List ar2 = new ArrayList<>();
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("guava");
		ll.add("Mango");
		ll.add("apple");
		ll.add("Grapes");
		
		ll.add(2, "Kiwi");
		
		System.out.println(ll);
		
		Stack st = new Stack();
		
		st.push(5);
		st.push(25);
		st.push(55);
		st.push(65);
		
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
	}

}
