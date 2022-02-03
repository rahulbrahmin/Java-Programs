package lists;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class MyArrayList {

	public static void main(String[] args) {
		List<String> fruits = new LinkedList<>();
//		List<String> vegetables = new ArrayList<>();
		
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Guava");
		
//		vegetables.add("Potato");
//		vegetables.add("Tomato");
//		vegetables.add("Onion");
		
//		fruits.addAll(vegetables);
		
//		fruits.remove(2);
		
		List<String> toRemove = new ArrayList<>();
		
//		toRemove.add("Mango");
//		toRemove.add("Guava");
//		
//		fruits.removeAll(toRemove);
//		fruits.clear();
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
		
		for(String e : temp)
			System.out.print(e + " ");
		
		System.out.println();
		
		for(String e : fruits)
			System.out.print(e + " ");
		
		//System.out.println(fruits);
		
	}

}
