package chegg;

import java.util.Arrays;

public class ArrayBag<E> implements BagInterface<E> {
	// field variable to store capacity of ArrayBag
	static int capacity;
	
	// Generic array to store items.
	E[] ar;
	
	// Field variable to know items present in array bag
	int size;
	
	// boolean variable to check if our array bag is initialized or not
	boolean initialized = false;
	
	/**
	 * Default constructor
	 */
	public ArrayBag() {
		this(capacity);
	}
	
	/**
	 * Parameterized constructor to initialize our array bag.
	 * This constructor also helps initialize our generic array and gives it size
	 * @param capacity is the the maximum capacity passed by user.
	 */
	public ArrayBag(int capacity) {
		if(capacity < 0)
			throw new IllegalArgumentException("Please enter a valid capacity");
		
		ar = (E[]) new Object[capacity];
		
		size = 0;
		
		initialized = true;
	}
	
	boolean isInitialized() {
		return initialized;
			
	}
	
	/* Defining BagInterface methods */

	/**
	 * This method adds given item to array ar
	 * if item is successfully added it returns true else false. 
	 */
	@Override
	public boolean add(E item) {
		if(this.isInitialized()) {
			if(size >= ar.length || item == null)
				return false;
			
			ar[size] = item;
			size++;
		}
		return true;
	}

	/**
	 * This method returns array containing all elements in ar.
	 */
	@Override
	public E[] toArray() {
		
		return Arrays.copyOf(ar , size);
	}

	/**
	 * This method returns true if size of Array bag is full else it returns false.
	 */
	@Override
	public boolean isFull() {
		if(this.size == this.capacity)
			return true;
		
		return false;
	}

	/**
	 * This method returns true if array bag is empty else it returns false.
	 */
	@Override
	public boolean isEmpty() {
		if(this.size == 0)
			return true;
		
		return false;
	}

	/**
	 * This method returns total elements currently present in array bag.
	 */
	@Override
	public int getCurrentSize() {
		return this.size;
	}
	
	/**
	 * This method returns frequency of item in array bag
	 */
	@Override
	public int getFrequencyOf(E item) {
		int count = 0;
		
		for(int i=0 ; i<this.size ; i++) {
			if(ar[i] == item)
				count++;
		}
		
		return count;
	}

	/**
	 * This method checks if given item is present in array bag or not.
	 */
	@Override
	public boolean contains(E item) {
		for(int i=0 ; i<this.size ; i++) {
			if(ar[i] == item)
				return true;
		}
		
		return false;
	}

	/**
	 * This method clears whole array bag.
	 */
	@Override
	public void clear() {
		for(int i=0 ; i<this.size ; i++) {
			ar[i] = null;
		}
		
		this.size = 0;
	}

	/**
	 * This method removes given item form array bag.
	 */
	@Override
	public E remove(int index) {
		if(index >= size) {
			System.out.println("Enter a valid index");
			return null;
		}
		
		E temp = ar[index];
		
		ar[index] = ar[size - 1];
		ar[size - 1] = null;
		
		size--;
		
		return temp;
	}

	/**
	 * This method returns index of given item in array bag
	 */
	@Override
	public int getIndexOf(E item) {
		
		for(int i=0 ; i<size ; i++) {
			if(ar[i] == item)
				return i;
		}
		
		return -1;
	}
	
	
}
