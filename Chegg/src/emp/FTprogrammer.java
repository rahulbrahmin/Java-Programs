package emp;

//Child Class that extends Employee
public class FTprogrammer extends Employee{
	String enrollmentDate;
	int Bonus;
	
	//Constructor to initialize all its variables and of parent class as well
	public FTprogrammer(String name, int ID, String Gender, float Salary , String enrollmentDate 
			, int bonus) {
		super(name, ID, Gender, Salary);
		
		this.enrollmentDate = enrollmentDate;
		this.Bonus = bonus;
	}
	
	/**
	 * Overridden method 
	 */
	void printInfo() {
		System.out.println("Full time Programmer");
		System.out.println("---------------------\n");
		super.printInfo();
		
		System.out.println("Enrollment Date:  " + this.enrollmentDate);
		System.out.println("Bonus:  " + this.Bonus);
	}
	
	/**
	 * This method computes total salary by adding bonus to it.
	 */
	void Compute() {
		super.Salary = super.Salary += this.Bonus;
	}
}
