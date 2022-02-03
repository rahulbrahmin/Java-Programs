package chegg1;

public class Employee {
	String firstName;
	String lastname;
	int id;
	String status;
	
	int hours;
	int hourlyRate;
	int overTime;
	static final int tax = 30;
	
	/**
	 * This method is used to get the first name of employee
	 * @param firstname is the fist name entered by user
	 */
	void getFirstName(String firstname) {
		this.firstName = firstname;
	}
	
	
	/**
	 * This method is used to get the last name of employee
	 * @param lastname is the last name entered by user
	 */
	void getlastname(String lastname) {
		this.lastname = lastname;
	}
	
	/**
	 * This method is used to get the marital status of employee
	 * @param status is the status entered by user
	 */
	void getStatus(String status) {
		this.status = status;
	}
	
	/**
	 * This method is used to get the id of employee
	 * @param id is the id entered by user
	 */
	void getId(int id) {
		this.id = id;
	}
	
	/**
	 * This method is used to get the hours worked by employee in a week
	 * @param hours is the hours entered by user
	 */
	void getHours(int hours) {
		this.hours = hours;
	}
	
	/**
	 * This method is used to get the hourly rate
	 * @param hourlyrate is hourly rate entered by user
	 */
	void getHourlyrate(int hourlyrate) {
		this.hourlyRate = hourlyrate;
	}
	
	/**
	 * This method is used to get the over time worked ny employee
	 * @param overTime is the over time entered by user 
	 */
	void getOverTime(int overTime) {
		this.overTime = overTime;
	}
	
	/**
	 * This method is used to return the gross pay of employee of 1 week
	 * @return float it return gross pay
	 */
	float computeGrossPay() {
		if(this.overTime > 0) {
			return (this.hours * this.hourlyRate) + (this.overTime * this.hourlyRate);
		}
		
		return (this.hours * this.hourlyRate);
	}
	
	/**
	 * This method is used to calculate the tax
	 * @return float it returns tax
	 */
	float computeTax() {
		return ((this.tax * this.computeGrossPay()) / 100);
	}
	
	/**
	 * This method is used to calculate net pay of employee of 1 week
	 * @return float it returns net pay.
	 */
	float computeNetpay() {
		return (this.computeGrossPay() - this.computeTax());
	}
	
	/**
	 * This method displays entire report of employee
	 */
	void report() {
		System.out.println("Employee's Name:  " + this.firstName.charAt(0) + " " + this.lastname);
		System.out.println("Employee's Id:  " + this.id);
		System.out.println("Marital Status:  " + this.status);
		System.out.println("Hours worked:  " + this.hours);
		System.out.println("Over Time:  " + this.overTime);
		System.out.println("Hourly Rate:  " + this.hourlyRate);
		
		// using output formatting
		System.out.printf("Gross Pay:  %2.2f %n", this.computeGrossPay());
		System.out.printf("Tax:  %2.2f %n", this.computeTax());
		System.out.printf("Net Pay:  %2.2f %n", this.computeNetpay());
	}
}
