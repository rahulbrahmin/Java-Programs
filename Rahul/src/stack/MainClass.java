package stack;

public class MainClass {

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		
		ms.push("Rahul");
		ms.push(5);
		ms.push("Wah");
		ms.print();
		System.out.println(ms.pop());
		ms.print();
	}

}
