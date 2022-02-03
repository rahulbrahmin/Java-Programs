package maps;

import java.util.*;

public class MyMap {

	Map map;
	
	Map[] arr = new Map[16];
	
	public void put(int key , String value) {
		Map add = new Map(key , value);
		if(key == 0) {
			arr[0] = add;
		}
		if(key == 0 && arr[key] != null) {
			arr[0].value = value;
		}
		else if(arr[key] == null) {
			arr[key] = add;
		}
		else if(arr[key] != null) {
			Map temp = arr[key];
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = add;
		}
	}
	
	String get(int k) {
		return arr[k].value;
	}
	
	String grtOrDefault(int k , String defaultValue) {
		if(arr[k] != null)
			return arr[k].value;
		
		return defaultValue;
	}
	
	boolean containsKey(int k) {
		if(arr[k] == null)
			return false;
		
		return true;
	}
	
	boolean containsValue(String value) {
		
		boolean isPresent = false;
		
		for(int i=0 ; i< arr.length; i++) {
			Map temp = arr[i];
			if(temp == null)
				continue;
			while(temp != null) {
				if(temp.value == value) {
					isPresent = true;
					break;
				}
				temp = temp.next;
			}
		}
		return isPresent;
		
	}
	
	void replace(int k , String value) {
		if(arr[k] == null) {
			return ;
		}
		arr[k].value = value;
	}
	
	void replace(int k , String oldValue , String newValue) {
		if(arr[k] == null)
			return ;
		
		if(arr[k].value == oldValue) {
			arr[k].value = newValue;
		}
	}
	
	String remove(int k) {
		if(arr[k] == null)
			return null;
		String temp = arr[k].value;
		
		arr[k].value = null;
		return temp;
	}
	
	String remove(int k , String value) {
		if(arr[k] == null)
			return null;
		String temp = null;
		if(arr[k].value == value) {
			temp = arr[k].value;
			
			arr[k].value = null;
		}
		
		return temp;
	}
	
	ArrayList<Integer> keySet() {
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0 ;i <arr.length ; i++) {
			if(arr[i] != null) {
				a.add(i);
			}
		}
		return a;
	}
	
	ArrayList<String> values(){
		ArrayList<String> s = new ArrayList<>();
		
		for(int i=0;i<arr.length; i++) {
			if(arr[i] != null) {
				Map temp = arr[i];
				while(temp != null) {
					if(temp.value != null)
					s.add(temp.value);
					temp = temp.next;
				}
			}
		}
		return s;
	}
	
	
	void print() {
		for(int i=0 ; i<16;i++) {
			Map temp = arr[i];
			if(temp == null)
				continue;
			if(arr[i] != null) {
				while(temp != null) {
					if(temp.value != null)
					System.out.print(temp.value + " ");
					temp = temp.next;
				}
			}
		}
		System.out.println();
	}
	
	public class Map{
		int key;
		String value;
		Map next;
		
		Map(int key , String value){
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		MyMap m = new MyMap();
		m.put(0, "Rahul");
		//m.put(0, "Dj");
		m.put(1, "Dubey");
		m.put(1, "Dubey");
		m.put(2, "Rudramani");
		m.put(15, "Dj");
		
		//m.replace(15, "Rudra");
		m.replace(15, "Dj", "Rudra");
		
		System.out.println(m.remove(1));
		//System.out.println(m.remove(2 , "Rudramani"));
		m.print();
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		System.out.println(m.get(2));
		System.out.println(m.grtOrDefault(14, "Wow"));
		System.out.println(m.containsKey(15));
		System.out.println(m.containsValue("Rahul"));
		
		
	}
}
