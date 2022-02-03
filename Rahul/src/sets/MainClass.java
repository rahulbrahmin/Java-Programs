package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
//		Set<String> fruits = new HashSet<>();
//		
//		fruits.add("Apple");
//		fruits.add("Mango");
//		fruits.add("Banana");
//		fruits.add("Guava");
//		
//		System.out.println(fruits.add("Kiwi"));
//		System.out.println(fruits.add("Apple"));
//		
//		System.out.println(fruits);
		
		Set<Integer> x = new HashSet<>();
		x.add(1);
		x.add(5);
		x.add(7);
		x.add(15);
		
		Set<Integer> y = new HashSet<>();
//		y.add(8);
		y.add(7);
		y.add(5);
		y.add(26);
		
//		x.addAll(y);
//		x.retainAll(y);
		System.out.println(x.containsAll(y));
	}

}
