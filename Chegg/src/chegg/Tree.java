package chegg;


public class Tree { 
	
	Node root;
    static class Node {    
    int value; 
        Node left, right; 
          
        Node(int value){ 
            this.value = value; 
            left = null; 
            right = null; 
        } 
    } 
       
    public void insert(Node node, int value) {
        if (value < node.value) { if (node.left != null) { insert(node.left, value); } else { System.out.println(" Inserted " + value + " to left of " + node.value); node.left = new Node(value); } } else if (value > node.value) {
          if (node.right != null) {
            insert(node.right, value);
          } else {
            System.out.println("  Inserted " + value + " to right of "
                + node.value);
            node.right = new Node(value);
          }
        }
      }
     public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
     }
     
     Node getLeft(Node node) {
    	 return node.left;
     }
     
     Node getRight(Node node) {
    	 return node.right;
     }
     
     static int dj(Node node) {
    	 if(node == null)
    		 return 0;
    	 else {
    		 
    		 return 1 + Math.max(dj(node), dj(node.right));
    	 }
     }
     
     public static void main(String args[]) 
    { 
//    Tree tree = new Tree();
//                Node root = new Node(14);
//                System.out.println("Binary Tree Example");
//                System.out.println("Building tree with root value " + root.value);
//                tree.insert(root, 1);
//                tree.insert(root, 14);
//                tree.insert(root, 8);
//                tree.insert(root, 10);
//                tree.insert(root, 8);
//                tree.insert(root, 12);
//                tree.insert(root, 9);
//                System.out.println("Traversing tree in order");
                Tree tree = new Tree();
                
                tree.root = new Node(14);
                tree.root.left = new Node(14);
                tree.root.right = new Node(1);
                tree.root.left.left = new Node(10);
                tree.root.left.right = new Node(8);
                tree.root.right.left = new Node(12);
                tree.root.right.left = new Node(8);
                
//                tree.traverseInOrder();
                System.out.println(dj(tree.root));
                
                
              }
}