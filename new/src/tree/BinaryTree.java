package tree;
import java.util.*;
import java.util.Scanner;

public class BinaryTree<T> {
	static Scanner sc = new Scanner(System.in);
	
	static Node createTree() {
		Node root = null;
		
		System.out.println("Enter data:  ");
		int data = sc.nextInt();
		
		if(data ==  -1)
			return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for " + data );
		root.left = createTree();
		
		System.out.println("Enter right for " + data );
		root.right = createTree();
		
		return root;
	}
	
	//Traversals
	
	/**
	 * left
	 * data
	 * right
	 * @param head
	 */
	static public void inOrder(Node head) {
		if(head == null)
			return;
		
		inOrder(head.left);
		System.out.print(head.data + " ");
		inOrder(head.right);
	}
	
	/**
	 * data
	 * left
	 * right
	 * @param head
	 */
	static void preOrder(Node head) {
		if(head == null)
			return;
		
		System.out.print(head.data + " ");
		preOrder(head.left);
		preOrder(head.right);
	}
	
	static void postOrder(Node head) {
		if(head == null)
			return;
		
		postOrder(head.left);
		postOrder(head.right);
		System.out.print(head.data + " ");
	}
	
	static void levelOrder(Node head) {
		ArrayDeque<Node> ar = new ArrayDeque<>();
		
		ar.add(head);
		Node nullNode = new Node(null);
		ar.add(nullNode);
		
		while(!ar.isEmpty()) {
			Node temp = ar.poll();
			
			if(temp == nullNode) {
				if(ar.isEmpty())
					return;
				
				System.out.println();
				ar.add(nullNode);
			}
			
			if(temp != nullNode)
				System.out.print(temp.data + " ");
			
			if(temp.left != null)
				ar.add(temp.left);
			
			if(temp.right != null)
				ar.add(temp.right);
		}
	}
	
	static int height(Node head) {
		if(head == null)
			return 0;
		
		return Math.max(height(head.left), height(head.right)) + 1;
	}
	
	static int size(Node head) {
		if(head == null)
			return 0;
		
		return (size(head.left) + size(head.right) + 1);
	}
	
	static int max(Node head) {
		if(head == null)
			return 0;
		
		return Math.max((int) head.data, (Math.max(max(head.left), max(head.right))));
	}
	
	static Node maxNode = new Node(Integer.MAX_VALUE);
	
	static void rightViewUtil(ArrayList<Node> ar , Node head , int level) {
		if(head == null)
			return;
		
//		if(ar.get(level) == maxNode)
//			ar.add(head);
			ar.set(level, head);
		
		rightViewUtil(ar , head.left , level+1);
		rightViewUtil(ar , head.right , level+1);
	}
	
	static void rightView(Node head) {
		ArrayList<Node> ar = new ArrayList<>();
		
		for(int i=0 ; i<height(head) ; i++) {
			ar.add(maxNode);
		}
		
		rightViewUtil(ar , head , 0);
		
		for(Node x : ar)
			System.out.print(x.data + " ");
	}
	
	static void topViewUtil(TreeMap<Integer , Node> mp , Node head , int step) {
		if(head == null)
			return;
		
		mp.putIfAbsent(step, head);
		
		//for bottom view
//		mp.put(step, head);
		
		topViewUtil(mp , head.left , step-1);
		topViewUtil(mp , head.right , step+1);
	}
	
	static void topView(Node head) {
		TreeMap<Integer , Node> mp = new TreeMap<>();
		
		topViewUtil(mp , head , 0);
		
		for(Map.Entry<Integer, Node> x : mp.entrySet()) {
			System.out.print(x.getValue().data + " ");
		}
	}
	
	public static void main(String[] args) {
//		Node root = createTree();
//		
//		inOrder(root);
//		
//		System.out.println();
//		preOrder(root);
//		
//		System.out.println();
//		postOrder(root);
		
		Node head = new Node(5);
		head.left = new Node(1);
		head.left.left = new Node(2);
		head.left.right = new Node(4);
		head.left.right.left = new Node(3);
		head.left.right.right = new Node(6);
		head.left.right.right.left = new Node(9);
		head.right = new Node(7);
		
		Node root = head;
		
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		
		System.out.println(height(root));
		System.out.println(size(root));
		System.out.println(max(root));
		
		System.out.println("Level Order:-");
		levelOrder(root);
		
		System.out.println();
		rightView(head);
		
		System.out.println();
		topView(head);
	}

}

class Node<T>{
	T data;
	Node left , right;
	
	public Node(T data) {
		this.data = data;
	}
}