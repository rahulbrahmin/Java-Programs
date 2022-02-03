package map;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , Integer> map = new HashMap<>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("eight", 8);
		
//		map.putIfAbsent("one", 10);
		map.replace("one", 1 , 10);
		map.replace("two", 4 , 20);
		
//		System.out.println(map.get("four"));
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		for(Entry<String , Integer> entry : map.entrySet()) {
			entry.setValue(entry.getValue() * 100);
		}
		
		System.out.println(map);
	}

}
