package chegg1;

public class ItStudent extends Student implements GrdauteStudent{
	//private variables
	private String major;
	private double gpa;
	
	/**
	 * Four - argument constructor
	 * It also invoke its super class constructor
	 * @param id is id for super class
	 * @param name is name for super class
	 * @param major is passed by user for this class 
	 * @param gpa is gpa passed by user
	 */
	public ItStudent(int id , String name , String major , double gpa) {
		//invoking super class
		super(id , name);
		
		this.major = major;
		this.gpa = gpa;
	}
	
	/**
	 * This method calculates gpa 
	 * @param newGrade is the new grade passed by user
	 * @return calculated gpa
	 */
	public double calcGPA(double newGrade) {
		return (this.gpa + 111.0) / newGrade;
	}

	/**
	 * Override Object's toString method.
	 */
	@Override
	public String toString() {
		return ("Name = " + super.getName() + " , ID = " + super.getId() + " , Gpa = " + this.gpa);
	}
	
	/**
	 * implementing interface method
	 * @return true if gpa is greater than or equal 2 else false
	 */
	@Override
	public boolean getStatus() {
		return (this.gpa >= 2.0);
	}
	
	
}
