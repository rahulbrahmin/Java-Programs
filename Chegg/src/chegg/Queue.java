package chegg;

/**
 * Queue class 
 * It uses FIFO.
 * It implements the functionality of queuing in a hospital.
 * @author RUDRAMANI DUBEY
 *
 */
public class Queue {
	Node root;
	
	/**
	 * This method adds details of patient to the queue.
	 * This method adds patient's detail at the end of the queue as per FIFO functionality.
	 * @param id stores id of patient
	 * @param disease stores disease from which patient is suffering.
	 */
	void store(int id , String disease) {
		Node toAdd = new Node(id , disease);
		
		if(root == null) {
			root = toAdd;
			return;
		}
		
		Node temp = root;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = toAdd;
	}
	
	/**
	 * This method deletes the entries of patient from queue.
	 * It deletes first entry present in queue as per FIFO(First In First Out) functionality.
	 * @throws Exception if queue is empty, it throws exception.
	 */
	void delete() throws Exception{
		if(root == null) {
			throw new Exception("Queue is already empty.");
		}
		
		root = root.next;
	}
	
	/**
	 * This method display queue data.
	 */
	void print() {
		if(root == null) {
			System.out.println("Can't print an empty queue.");
			return;
		}
		
		Node temp = root;
		
		while(temp != null) {
			System.out.println("Id:  " + temp.id + "\tDisease:  " + temp.disease);
			temp = temp.next;
		}
	}
	
	/**
	 * Node class to store different entries of patients.
	 * @author RUDRAMANI DUBEY
	 *
	 */
	class Node{
		int id;
		String disease;
		
		// next pointer to connect each nodes
		Node next;
		
		Node(int id , String disease){
			this.id = id;
			this.disease = disease;
		}
	}

	// driver / main method
	public static void main(String[] args) throws Exception {
		Queue q = new Queue();
		
		// a) Storing information.
		
		q.store(250, "Cholera");
		q.store(456, "Pneumonia");
		q.store(125, "Jaundice");
		q.store(654, "Corona");
		q.store(521, "Dengue");
		q.store(823, "Influenza");
		q.store(273, "Chickenpox");
		
		// b) Displaying queue data.
		q.print();
		
		// Deleting information.
		q.delete();
		q.delete();
		
		System.out.println("\nAfter deleting few entries from queue.\n");
		q.print();
	}

}
