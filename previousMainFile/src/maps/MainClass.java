package maps;
import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		Map<String , Integer > map = new HashMap<>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("five", 5);
		
		map.put("two" , 4);
		
//		Map<String , Integer> map2 = new HashMap<>();
//		
//		map2.put("four", 4);
//		map2.put("six", 6);
//		map2.put("eight", 8);
//		map2.put("two" , 2);
//		map2.put("one" , 1);
//		
//		map.putAll(map2);
		
		//System.out.println(map.replace("two", 3, 2));
		map.replace("two", 2);
		
		//System.out.println(map.remove("eight"));
		//map.remove("two", 2);
		
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		System.out.println(map.entrySet());
		
		Set<Entry<String , Integer>> entries = map.entrySet();
		
		for(Entry<String , Integer> entry : entries) {
			entry.setValue(entry.getValue() * 100);
		}
		
		for(Entry<String , Integer> entry : map.entrySet()) {
			entry.setValue(entry.getValue() * 10);
		}
		
		
		
		System.out.println(map);
	}

}
