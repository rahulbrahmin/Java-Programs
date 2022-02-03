package chegg1;

//class to create nodes


class BinaryTree {
	class Node {
		int key;
		Node left, right;

		public Node(int item) {
		key = item;
		left = right = null;
		}

		Node root;

		Node getLeft() {
			 return root.left;
		}

		Node getRight() {
			 return root.right;
		}

		public int dj(Node node) {
			 if(node == null)
				 return 0;
			 else {
				 return 1 + Math.max(dj(node.getLeft()), dj(node.getRight()));
			 }
		}

		}
	
	
Node root;

// Traverse tree
public void traverseTree(Node node) {
 if (node != null) {
   traverseTree(node.left);
   System.out.print(" " + node.key);
   traverseTree(node.right);
 }
}



public static void main(String[] args) {

 // create an object of BinaryTree
 BinaryTree tree = new BinaryTree();

 // create nodes of the tree
// tree.root = new Node(14);
// tree.root.left = new Node(14);
// tree.root.right = new Node(1);
// tree.root.left.left = new Node(10);
// tree.root.left.right = new Node(8);
// tree.root.right.left = new Node(12);
// tree.root.right.left = new Node(8);

 System.out.print("\nBinary Tree: ");
 tree.traverseTree(tree.root);
 
// System.out.println(dj(tree.root));
}
}
