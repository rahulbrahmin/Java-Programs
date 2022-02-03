package chegg;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Set<Integer> integerSet = new HashSet<>();          // Integer set.
		 
		integerSet.add(3);
		integerSet.add(1);                                   // adding elements.
		integerSet.add(4);
		integerSet.add(2);
		
		System.out.println(integerSet);                       // displaying set.
		
		Set<String> fruitSet = new HashSet<>();            // String set of fruits.
		
		fruitSet.add("apple");
		fruitSet.add("orange");
		fruitSet.add("papaya");
		
		System.out.println(fruitSet);
		
		Set<Character> charSet = new HashSet<>();            // charSet
		
		charSet.add('A');
		charSet.add('m');
		charSet.add('&');
		
		System.out.println(charSet);
		
		//Part 1   (Empty set)
		
		Set<Integer> st = new HashSet<>();
		
		if(st.isEmpty())                             // if set will be empty , It will display {} else set.
			System.out.println("{}");             
		else
			System.out.println(st);
		
		if(integerSet.isEmpty())                             // if set will be empty , It will display {} else set.
			System.out.println("{}");             
		else
			System.out.println(integerSet);
		
		
		//Part 2   (Checking element inside set).
		
		if(integerSet.contains(3))
			System.out.println("Belongs to");
		else
			System.out.println("Not belongs to");
		
		
		
		//Part 3    (Checking subset).
		
		Set<Integer> st1 = new HashSet<>();
		st1.add(3);
		st1.add(2);
		
		if(integerSet.containsAll(st1))                          // checks whether st1 is subset of integerSet or not
			System.out.print(st1 + " is subset of " + integerSet);
		else
			System.out.print(st1 + " is not a subset of " + integerSet);
		
		System.out.println();
		//Part 4          (Cardinal Number)
		
		System.out.println(integerSet.size());               // It prints total elements in integerSet(i.e it's cardinal number)
		System.out.println(fruitSet.size());
		System.out.println(charSet.size());

	}

}
