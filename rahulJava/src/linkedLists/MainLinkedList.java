package linkedLists;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
//		List<Integer> li = new LinkedList<>();
//		Stack<Integer> s = new Stack();
//		List<Integer> al = new ArrayList<>();
//		
//		getTimeDiff(al);
//		getTimeDiff(li);
//		
//	}
//	static void getTimeDiff(List<Integer> list) {
//		long start = System.currentTimeMillis();
//		
//		for(int i=0;i<100000;i++) {
//			list.add(0 , i);
//		}
//		
//		long end = System.currentTimeMillis();
//		
//		System.out.println(list.getClass().getName()
//				      + "-->  " + (end - start));
		
		
		MyLinkedList<String> myLL = new MyLinkedList<>();
		
		myLL.add("Rahul");
		myLL.add("Khiladi");
		myLL.add("Dubey");
		myLL.set(2 , "Dj");
//		myLL.remove(2);
		
//		myLL.rempveAll();
		
//		for(int i=0;i<10;i++) {
//			myLL.add(i);
//		}
		
		myLL.print();
		System.out.println(myLL.contains("Khiladi"));
		//System.out.println(myLL.size());
		//System.out.println(myLL.get(1));
		String ans = "Rahul";
		System.out.println(ans.length());
	}
	
}
