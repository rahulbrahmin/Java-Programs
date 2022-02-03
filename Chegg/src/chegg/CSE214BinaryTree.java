package chegg;

public class CSE214BinaryTree<T> {
	
	TreeNode root;
	
	TreeNode add(TreeNode node , int data) {                  // recursive method to add
		if(node == null)
			return new TreeNode(data);
		
		if(data < node.data) {
			node.left = add(node.left , data);
		}
		else if(data > node.data) {
			node.right = add(node.right , data);
		}
		else {
			return node;
		}
		
		return node;
	}
	
	public void add(int data) {                     // method to start adding recursively
		root = add(root , data);
	}
	
	public interface CSE214Tree {                 //  interface
		
		
		static void preOrder(TreeNode root) {          // Recursive Method for Preorder Traversal
			if(root == null)
				return ;
			
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
		static void inOrder(TreeNode root) {          //  Recursive Method for Inorder Traversal
			if(root == null)
				return ;
			
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
		
		static void postOrder(TreeNode root) {        // Recursive Method for Postorder Traversal
			if(root == null)
				return ;
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
		
		static int numNodes(TreeNode root) {          // recursive method to return number of nodes.
			if(root == null)
				return 0;
			
			return (1 + numNodes(root.left) + numNodes(root.right));   
		}
		
		
		static int depth(TreeNode root) {           // method to find depth/height of tree recursively
			if(root == null)
				return 0;
			else {
				int leftHeight = depth(root.left);      
				int rightHeight = depth(root.right);
				
				if(rightHeight > leftHeight)
					return(rightHeight + 1);
				else
					return(leftHeight + 1);
			}
		}
	}
}



class TreeNode{                             // class to create tree node
	int data;  
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data){                // constructor
		this.data = data;
		this.left = null;
		this.right = null;
	}
}