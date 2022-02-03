package stacks;

public class NewStack {
	int capacity;
	int[] arr = new int[capacity];
	int top;
	
	public NewStack() {
		top = -1;
	}
	
	
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(top == capacity - 1) {
			return true;	
		}
		else
			return false;
	}
	
	public void push(int data) {
		
		if(!isFull()) {
			top += 1;
			arr[top] = data;
		}
		else
			System.out.println("Overflow");
	}
	
	public void pop() {
		if(!isEmpty()) {
			int data = arr[top];
			top -= 1;
			
			System.out.println(data);
		}
		else
			System.out.println("Underflow");
	}
	
	public void top() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else
			System.out.println(arr[top]);
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			for(int i = 0 ; i <= top ; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
        NewStack stack = new NewStack();
		
        stack.capacity = 4;
		stack.push(10);
		stack.push(25);
		stack.push(35);
		stack.push(50);
		stack.pop();stack.pop();
		stack.pop();
		//stack.pop();
		
		stack.print();
		
	}
}
