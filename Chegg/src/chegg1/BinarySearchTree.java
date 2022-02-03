package chegg1;

import chegg1.BinarySearchTree1.Node;

public class BinarySearchTree {   

    //to add recursively
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

    //To print tree
	static void print(Node head) {
		if(head != null) {
			print(head.left);
			System.out.print(head.data + " ");
			print(head.right);
		}
	}


    //Node class to store elements of binary search tree mande using double linked list
	static class Node{
		int data;
		Node left;
		Node right;
			
	}

    //To make node of tree  
	static Node treeNode(int data)  
	{  
	 Node temp = new Node();  
	 temp.data = data;  
	 temp.left = null; 
	 temp.right = null;  
	 return temp;  
	}  
	
	// Recursively deletes the terminal nodes along with printing them
	static Node deleteTerminals(Node head)  
	{  
	 if (head.left == null && head.right == null) {  
		 System.out.print(head.data + " ");
	     return null;  
	 }  
 
	 head.left = deleteTerminals(head.left);  
	 head.right = deleteTerminals(head.right);  

	 return head;  
	}
	


    public static void main(String[] args) {
    	
    	System.out.println("Binary Search Tree with left child greater than right child\n");
    	
    	Node head = null;  
    	
    	head = add(head, 50);  
    	add(head, 40);  
    	add(head, 30);  
    	add(head, 45);  
    	add(head, 70);  
    	add(head, 60);  
    	add(head, 80);  
    	 
    	 print(head);  
    	 System.out.println("\n\nDeleting terminal nodes");  
    	 deleteTerminals(head);  
    	 
    	 System.out.println("Tree after deleting terminal nodes");
    }
}  