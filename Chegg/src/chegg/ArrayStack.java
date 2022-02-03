package chegg;

import java.util.Stack;

/**
 * ArrayStack class 
 * Stack has been implemented using array.
 * @author RUDRAMANI DUBEY
 *
 * @param <E>
 */
public class ArrayStack<E> {
	int capacity;
	E[] ar;
	int top = -1;
	
	public ArrayStack(){
		//initialize initial capacity of stack with 50
		this.capacity = 50;
		
		//Generic array to store stack elements.
		ar = (E[]) (new Object[capacity]);
	}
	
	/**
	 * This method return true if stack is empty and vice-versa.
	 * @return
	 */
	public boolean isEmpty() {
		return this.top == -1;
	}
	
	/**
	 * This method push given element to stack.
	 * @param data is the element passed by user to be added inn stack.
	 */
	public void push(E data) {
		//if capacity has reached 50 , double the capacity.
		if(this.capacity == 50)
			capacity *= 2;
		
		top++;
		ar[top] = data;
	}
	
	/**
	 * This method removes top element from stack.
	 */
	public void pop() {
		if(this.isEmpty()) {
			System.out.println("Couldn't pop from empty stack");
			return;
		}
		
		this.top--;
	}
	
	/**
	 * @return top element of stack
	 */
	public E top()  {
		if(this.isEmpty()) {
			System.out.println("Stack is empty.");
			return null;
		}
		
		return this.ar[top];
	}
	
	/**
	 * @return size of stack
	 */
	public int size() {
		return this.top + 1;
	}
	
	/**
	 * This method prints entire stack.
	 */
	public void print() {
		if(this.isEmpty()) {
			System.out.println("Can't print empty stack");
			return;
		}
		
		for(int i=0 ; i<=top ; i++) {
			System.out.print(this.ar[i] + " ");
		}
		
		System.out.println();
	}
	
	// driver method
	public static void main(String[] args) {
		ArrayStack<Integer> st = new ArrayStack<>();
		
		//pushing elements to stack
		st.push(20);
		st.push(14);
		st.push(18);
		st.push(16);
		st.push(10);
		System.out.print("Stack (before method call):  ");
		st.print();
		
		// calling our method.
		removeBelow(15 , st);
		
		System.out.println();
		System.out.print("Stack (after method call):  ");
		st.print();
	}
	
	/**
	 * This is the required method which removes all elements from given ArrayStack that are below elem
	 * @param elem is the element passed by user from which below elements he want to be removed.
	 * @param st is the ArrayStack of Integer type from which elements are to be removed.
	 */
	public static void removeBelow(int elem , ArrayStack<Integer> st) {
		//taking an temporary stack to store all required elements of st
		ArrayStack<Integer> temp = new ArrayStack<>();
		
		int s = st.size();
		
		//iterating st
		for(int i=0 ; i<s ; i++) {
			
			// if top element is less than elem , simply remove it from stack.
			if(st.top() < elem) {
				st.pop();
			}
			// else add it to temp then remove from st
			else {
				temp.push(st.top());
				st.pop();
			}
		}
		
		s = temp.size();
		
		// iterating temp stack to add back all required elements to original stack st.
		for(int i=0 ; i<s ; i++) {
			st.push(temp.top());
			temp.pop();
		}
	}
}
