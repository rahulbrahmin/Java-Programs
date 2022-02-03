package chegg;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public interface ListADT {
	boolean equals(Object obj);
	
	char get();
	
	void insert(char c);
	
	boolean next();
	
	boolean prev();
	
	void remove();
	
	char[] toCharArray(int s , int f);
	
	String toString();	
	
	public static void main(String[] args) {
		CharClass c1 = new CharClass();
		
		c1.insert('a');
		c1.insert('b');
		c1.insert('c');
		c1.insert('d');
		c1.insert('e');
		
		CharClass c2 = new CharClass();
		
		c2.insert('a');
		c2.insert('b');
		c2.insert('c');
		c2.insert('d');
		c2.insert('e');
		
		System.out.println(c1.equals(c2));
		
		c1.remove();
		
		c1.toString();
		System.out.println(c1);
		System.out.println(c1.prev());
		System.out.println(c1.next());
		
	}
}


class CharClass implements ListADT{
	LinkedList<Character> ll = new LinkedList<>();
	int current = -1;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + current;
		result = prime * result + ((ll == null) ? 0 : ll.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CharClass other = (CharClass) obj;
		if (current != other.current)
			return false;
		if (ll == null) {
			if (other.ll != null)
				return false;
		} else if (!ll.equals(other.ll))
			return false;
		return true;
	}
	
	public char get() throws NoSuchElementException {
		if(ll.get(current) < 0 || ll.get(current) == null) {
			throw new NoSuchElementException("List");
		}
		
		return ll.get(current);
	}
	
	public void insert(char c) {
		current++;
		ll.add(c);
	}
	
	public boolean next() {
		if(ll.get(current) == null)
			return false;
		else {
			current++;
			return true;
		}
	}
	
	public boolean prev() {
		if(ll.get(current - 1) == null || current <0 )
			return false;
		else {
			current--;
			return true;
		}
	}
	
	public void remove() {
		if(current <= 0)
			return;
		else {
			ll.remove(current-1);
		}
	}
	
	public char[] toCharArray(int s , int f) {
		char c[] = new char[150];
		
		
		if(s <= 0 || f > current) {
			throw new IllegalArgumentException("Enter valid indexes");
		}
		
		for(int i=s ; i<f ; i++) {
			c[i] = ll.get(i);
		}
		
		return c;
	}
	
	public String toString() {
		String st = "<";
		
		String temp = ll.toString();
		
		st += temp.substring(1 , temp.length()-1);
		
		st += ">";
		
		return st;
	}	
	
	public void print() {
		System.out.print("[ ");
		
		for(int i=0 ; i<=current ; i++) {
			
			System.out.print(ll.get(i) + " ");
			
		}
		
		System.out.print("]");
		
		System.out.println();
	}
	
}
