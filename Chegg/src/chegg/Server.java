package chegg;

public class Server {

	// field variables
	String types;
	int numOfConnectedUsers;
	
	/**
	 * Constructor to initialize server with its type and numOfConnectedUsers with 0
	 * @param types is the type of server
	 */
	public Server(String types){
		this.types = types;
		this.numOfConnectedUsers = 0;
	}
	
	/**
	 * @return the types
	 */
	public String getTypes() {
		return types;
	}
	
	/**
	 * @return the numOfConnectedUsers
	 */
	public int getNumOfConnectedUsers() {
		return numOfConnectedUsers;
	}


	/**
	 * @param numOfConnectedUsers the numOfConnectedUsers to set
	 */
	public boolean setNumOfConnectedUsers(int numOfConnectedUsers) {
		if(this.numOfConnectedUsers >= 100)
			return false;
		
		this.numOfConnectedUsers = numOfConnectedUsers;
		return true;
	}
	
	
	/**
	 * This method returns description of a server object.
	 */
	public String toString() {
		return "The Server types are " + this.types + ". It has " + this.numOfConnectedUsers
				+ " connected users";
	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Server's Object
		Server s1 = new Server("Web#FTP");
		
		// calling getTypes method
		System.out.println("Type: " + s1.getTypes());
		
		// setting number of users connected to the server
		s1.setNumOfConnectedUsers(7);
		
		// calling getNumberOfConnectedUsers
		System.out.println("Number of conected users: " + s1.getNumOfConnectedUsers());
		
		// calling toString method to get description of the object
		System.out.println(s1.toString());
	}

}
