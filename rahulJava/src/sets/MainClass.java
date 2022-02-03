package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> fruits = new TreeSet<>();
//		
//		//System.out.println(fruits.add("Guava"));
//		fruits.add("Kiwi");
//		fruits.add("Banana");
//		fruits.add("Apple");
//		fruits.add("Mango");
//		System.out.println(fruits.add("Guava"));
//		System.out.println(fruits.add("Apple"));
//		
//		System.out.println(fruits);
		
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		
		s1.add(1);
		s1.add(23);
		s1.add(13);
		
		s2.add(23);
		//s2.add(25);
		//s2.add(7);
		
		//s1.addAll(s2);
		//s1.retainAll(s2);
		System.out.println(s1.containsAll(s2));
		System.out.println(s1.contains(23));
		
		System.out.println(s1);
	}

}
