package chegg;

public class BinarySearchTree {
	Node head;
	
	// to add elements in tree
	void add(int data) {
		head = insert(head , data);
	}
	
	// to add recursively
	Node insert(Node head , int data) {	
		if(head == null) {
			head = new Node(data);
			return head;
		}
		
		if(data > head.data)
			head.left = insert(head.left , data);
		else if(data < head.data)
			head.right = insert(head.right , data);
			
		return head;	
	}
	
	// to print elements of tree in inorder
	void print() {
		inOrder(head);
	}
	
	// Recursive inorder traversal
	void inOrder(Node head) {
		if(head != null) {
			inOrder(head.left);
			System.out.println(head.data);
			inOrder(head.right);
		}
	}
	
	// To delete all terminal nodes of tree
	void deleteAndDisplayTerminals() {
		delete(head);
	}
	
	// Recursively deletes the terminal nodes along with printing them
	Node delete(Node head) {
		if(head.left == null && head.right == null) {
			System.out.print(head.data + " ");
			return null;
		}
		
		head.left = delete(head.left);
		head.right = delete(head.right);
		
		return head;
	}
	
	// Node class to store elements of binary search tree mande using double linked list
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String[] args) {
		System.out.println("Binary Search Tree with left child greater than right child\n");
		BinarySearchTree b = new BinarySearchTree();
		
		b.add(50);
		b.add(40);
		b.add(30);
		b.add(45);
		b.add(70);
		b.add(60);
		b.add(80);
		
		b.print();
		
		System.out.println("\n\nDeleting Terminal nodes:");
		b.deleteAndDisplayTerminals();
		
		System.out.println("\n\nTree after deleting terminal nodes");
		b.print();
	}

}
