package queue;

import java.util.*;

public class FlattenLinkedList {
	
	static Node flatten(Node head) {
		Node temp = head;
		
		Queue<Node> q = new ArrayDeque<>();
		
		while(temp != null) {
			if(temp.next == null)
				temp.next = q.poll();
			
			if(temp.down != null) {
				q.add(temp.down);
			}
			
			temp = temp.next;
		}
		
		return head;
	}
	
	 // Utility function to print a list with `down` and `next` pointers
    public static void printOriginalList(Node head)
    {
        if (head == null) {
            return;
        }
 
        System.out.print(" " + head.data + " ");
 
        if (head.down != null)
        {
            System.out.print("[");
            printOriginalList(head.down);
            System.out.print("]");
        }
 
        printOriginalList(head.next);
    }
 
    // Utility function to print a linked list
    public static void printFlattenedList(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
	
	static class Node{
		int data;
		Node next;
		Node down;
		
		Node(int data){
			this.data = data;
//			next = down = null;
		}
	}
	
public static void main(String[] args) {
		
		// create individual nodes and link them together later
//        Node one = new Node(1);
//        Node two = new Node(2);
//        Node three = new Node(3);
//        Node four = new Node(4);
//        Node five = new Node(5);
//        Node six = new Node(6);
//        Node seven = new Node(7);
//        Node eight = new Node(8);
//        Node nine = new Node(9);
//        Node ten = new Node(10);
//        Node eleven = new Node(11);
//        Node twelve = new Node(12);
//        Node thirteen = new Node(13);
//        Node fourteen = new Node(14);
//        Node fifteen = new Node(15);
//        Node sixteen = new Node(16);
//        Node seventeen = new Node(17);
 
        // set head node
//        Node head = one;
// 
        // set next pointers
//        one.next = two;
//        two.next = three;
//        three.next = four;
//        four.next = five;
//        
//        six.next = seven;
//        seven.next = eight;
//        eight.next = nine;
//        nine.next = ten;
//        
//        thirteen.next = fourteen;
//        
//        sixteen.next = seventeen;
// 
//        // set down pointers
//        one.down = six;
//        
//        four.down = nine;
//        seven.down = eleven;
//        eight.down = twelve;
//        nine.down = thirteen;
//        twelve.down = fifteen;
//        thirteen.down = sixteen;
        
	// create individual nodes and link them together later
    Node one = new Node(1);
    Node two = new Node(2);
    Node three = new Node(3);
    Node four = new Node(4);
    Node five = new Node(5);
    Node six = new Node(6);
    Node seven = new Node(7);
    Node eight = new Node(8);
    Node nine = new Node(9);
    Node ten = new Node(10);
    Node eleven = new Node(11);
    Node twelve = new Node(12);
    Node thirteen = new Node(13);
    Node fourteen = new Node(14);
    Node fifteen = new Node(15);

    // set head node
    Node head = one;

    // set next pointers
    one.next = four;
    four.next = fourteen;
    fourteen.next = fifteen;
    five.next = nine;
    nine.next = ten;
    seven.next = eight;
    eleven.next = thirteen;

    // set down pointers
    one.down = two;
    two.down = three;
    four.down = five;
    five.down = six;
    six.down = seven;
    ten.down = eleven;
    eleven.down = twelve;
	
	
//        head = flatten(head);
    Node dj = flattenWithoutQueue(head);
        
//        printOriginalList(dj);
        printFlattenedList(dj);
       
	}

    static Node flattenWithoutQueue(Node head) {
    	
    	Node last = head;
    	
    	Node temp = null;
    	
    	while(last.next != null) {
    		last = last.next;
    	}
    	
    	Node curr = head;
    	
    	while(curr != last) {
    		if(curr.down != null) {
    			last.next = curr.down;
    			
    			temp = curr.down;
    			
    			while(temp.next != null)
    				temp = temp.next;
    			
    			last = temp;
    		}
    		curr = curr.next;
    	}
    	
    	return head;
    }
}
