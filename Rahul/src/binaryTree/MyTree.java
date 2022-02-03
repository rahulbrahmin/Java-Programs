package binaryTree;

import java.util.Scanner;

public class MyTree<E> {
	
	static Scanner sc = null;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		TreeNode root = createTree();
		
		System.out.println();
		preOrder(root);
		
		System.out.println();
		inOrder(root);
		
		System.out.println();
		postOrder(root);
	}
	
	static TreeNode createTree() {
		TreeNode root = null;
		
		System.out.print("Enter data:  ");
		int data = sc.nextInt();
		
		if(data == -1)
			return null;
		
		root = new TreeNode(data);
		
		System.out.println("Enter left for: " + data);
		root.left = createTree();
		
		System.out.println("Enter right for: " + data);
		root.right = createTree();
		
		return root;
	}
	
	static void preOrder(TreeNode root) {
		if(root == null)
			return ;
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void inOrder(TreeNode root) {
		if(root == null)
			return ;
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	static void postOrder(TreeNode root) {
		if(root == null)
			return ;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
}

class TreeNode<E>{
	E data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(E data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}
