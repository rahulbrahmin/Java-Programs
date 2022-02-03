package chegg1;

public class Student {
	//private variables
	private int id;
	private String name;
	
	/**
	 * Two - argument constructor
	 * @param id is id passed by user
	 * @param name is name passed by user
	 */
	public Student(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * No argument constructor
	 */
	public Student() {
		
		// default values
		this.id = 0;
		this.name = "";
	}

	// Getters and setters for id name
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
