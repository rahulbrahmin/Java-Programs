package emp;

//Base class
public class Employee {
	//All required fields
	String name;
	int ID;
	String Gender;
	float Salary;
	
	//Constructor to initialize all field variables
	public Employee(String name , int ID , String Gender , float Salary){
		this.name = name;
		this.ID = ID;
		this.Gender = Gender;
		this.Salary = Salary;
	}
	
	/**
	 * This method prints all information about Employee.
	 */
	void printInfo() {
		System.out.println("Name:  " + this.name);
		System.out.println("ID:  " + this.ID);
		System.out.println("Gender:  " + this.Gender);
		System.out.println("Salary:  " + this.Salary);
	}
}
