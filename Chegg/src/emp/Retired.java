package emp;

//Child Class that extends Employee
public class Retired extends Employee {
	String terminationDate;

	//Constructor to initialize all its variables and of parent class as well
	public Retired(String name, int ID, String Gender, float Salary , String terminationDate) {
		super(name, ID, Gender, Salary);
		
		this.terminationDate = terminationDate;
	} 
	
	/**
	 * Overridden Method
	 */
	void printInfo() {
		System.out.println("Retired Employee ");
		System.out.println("-----------------\n");
		super.printInfo();
		
		System.out.println("Termination Date:  " + this.terminationDate);
	}
}
