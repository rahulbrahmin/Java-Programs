package chegg1;


public class BinarySearchTree1 {
	
	// Node class to store elements of binary search tree mande using double linked list
		static class Node{
			int data;
			Node left;
			Node right;
			
		}
		
		// To make node of tree 
		static Node treeNode(int data) {
			Node toAdd = new Node();
			
			toAdd.data = data;
			toAdd.left = null;
			toAdd.right = null;
			
			return toAdd;
		}
	
    // to add recursively
	static Node add(Node head , int data) {	
		if(head == null) {
			return treeNode(data);
		}
		
		if(data > head.data)
			head.left = add(head.left , data);
		else if(data < head.data)
			head.right = add(head.right , data);
			
		return head;	
	}
	
	
	// Recursive inorder traversal
	static void print(Node head) {
		if(head != null) {
			print(head.left);
			System.out.print(head.data + " ");
			print(head.right);
		}
	}
	
	// Recursively deletes the terminal nodes along with printing them
	static Node leafDelete(Node root)  
	{  
	 if (root.left == null && root.right == null) {  
		 System.out.print(root.data + " ");
	     return null;  
	 }  

	 // Else recursively delete in left and right  
	 // subtrees.  
	 root.left = leafDelete(root.left);  
	 root.right = leafDelete(root.right);  

	 return root;  
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Binary Search Tree with left child greater than right child\n");
		
		Node head = null;
		
		head = add(head , 50);
		add(head , 70);
		add(head , 65);
		add(head , 25);
		add(head , 45);
		add(head , 35);
		add(head , 55);
		add(head , 85);
		
		print(head);
		
		leafDelete(head);
		
		
	}

}
