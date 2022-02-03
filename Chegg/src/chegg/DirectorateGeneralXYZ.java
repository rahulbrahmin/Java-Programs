package chegg;

import java.util.Scanner;

/**
 * This class implements all the necesaary functionalities required in question.
 * @author RUDRAMANI DUBEY
 *
 */
public class DirectorateGeneralXYZ {
	
	// To get input from user
	Scanner sc = new Scanner(System.in);
	
	//Field variables to store Vehicle's Information
	String vehicleName;
	String vehicleType;
	int engineCapacity;
	int daysBeforeBought;
	
	int registrationFees;
	boolean isPaid;
	
	//Field variables to store driver's information
	String fName;
	String lName;
	int age;
	String residenceType;
	int numberOfVehicles;
	
	// variables to test driver's skills
	boolean eye;
	boolean traffic;
	boolean drum;
	boolean road;
	
	//Field variables for methods.
	boolean drivingLicense;
	boolean renewLicense;
	boolean approveForeignLicense;
	boolean registration;
	boolean renewRegistration;
	
	//Default constructor to initialize everything with false.
	DirectorateGeneralXYZ(){
		this.eye = false;
		this.traffic = false;
		this.drum = false;
		this.road = false;
		this.isPaid = false;
		this.drivingLicense = false;
		this.renewLicense = false;
		this.approveForeignLicense = false;
		this.registration = false;
		this.renewRegistration = false;
	}
	
	/**
	 * THis method sets details of driver.
	 */
	void setDriverDetails() {
		System.out.println("Please enter your details as follows:-");
		System.out.println();
		System.out.print("Enter your first name:  ");
		this.fName = sc.next();
		System.out.print("Enter your last name:  ");
		this.lName = sc.next();
		System.out.print("Enter residence type (citizen/resident):  ");
		this.residenceType = sc.next();
		System.out.print("Enter your age:  ");
		this.age = sc.nextInt();
		System.out.print("Enter number of vehicles he/she has:  ");
		this.numberOfVehicles = sc.nextInt();
		
		System.out.println();
	}
	
	/**
	 * This method is used to check whether driver has qualified for tests or not.
	 * If he has qualified press true else false
	 */
	void test() {
		if(this.residenceType == "citizen" && this.age < 17 || this.residenceType == "resident" 
				&& this.age < 18) {
			System.out.println("Sorry , You are not eligible for license. ");
			return;
		}
		System.out.print("Does Driver qualified Eye vision test:  ");
		this.eye = sc.nextBoolean();
		System.out.print("Does Driver qualified Traffic signal test:  ");
		this.traffic = sc.nextBoolean();
		System.out.print("Does Driver qualified Drum and Slope test:  ");
		this.drum = sc.nextBoolean();
		System.out.print("Does Driver qualified Road test:  ");
		this.road = sc.nextBoolean();
	}
	
	/**
	 * this method sets the vehicle details.
	 */
	void setVehicleDetails() {
		System.out.print("Enter Vehicle name:  ");
		this.vehicleName = sc.next();
		System.out.print("Enter Vehicle type (single / company / both):  ");
		this.vehicleType = sc.next();
		System.out.print("Enter Engine capacity:  ");
		this.engineCapacity = sc.nextInt();
		System.out.print("Enter days before you bought the vehicle:  ");
		this.daysBeforeBought = sc.nextInt();
		
		System.out.println();
	}
	
    /**
     * this method finds the registration fee of each vehicles based on their engine capacity.
     */
	void fee() {
		if(this.engineCapacity <= 100)
			this.registrationFees = 1000;
		else if(this.engineCapacity > 100 && this.engineCapacity <= 150)
			this.registrationFees = 1250;
		else
			this.registrationFees = 1500;
	}
	
	/**
	 * This method is used to check whether user is eligible to get driving license or not.
	 * It first takes all necessary tests.
	 */
	void getDrivingLicense() {
		this.test();
		
		if(this.eye == false || this.traffic == false || this.drum == false || this.road == false) {
			System.out.println("You have failed our tests to get eligible for license. Kindly applly"
					+ "another application and pass al the tests to get driving license.");
			return;
		}
		
		this.drivingLicense = true;
		System.out.println();
		System.out.println("Driving License issued");
	}
	
	/**
	 * this method is used to renew the driving license 
	 */
	void renewDrivingLicense() {
		if(this.drivingLicense == false) {
			System.out.println("You didn't have any license to be renewed. Get a license first !");
			return;
		}
		
		this.renewLicense = true;
		System.out.println("License get renewed");
	}
	
	/**
	 * This method is used to transfer the driving license to foreign license
	 */
	void exchangeAndApproveForeignDrivingLicense() {
		if(this.drivingLicense == false) {
			System.out.println("You didn't have any license to be exchanged with foreign license"
					+ ". Get a license first !");
			return;
		}
		
		this.approveForeignLicense = true;
		System.out.println("License is approved to be foreign license");
	}
	
	/**
	 * This method is used for vehicle's registration.
	 * It also calculates the registration fees.
	 * Press true if you are willing to pay registration fee and proceed to registration 
	 * else press false 
	 */
	void vehicleRegistration() {
		if(this.vehicleType == "single" && this.numberOfVehicles > 3) {
			System.out.println("You can't have more than 3 vehicles registered with your name");
			return;
		}
		
		if(this.registration == true) {
			System.out.println("Vehicle is already registered.");
			return;
		}
		if(this.daysBeforeBought > 50) {
			System.out.println("Sorry your vehicle can't be registered as you have already passed "
					+ "the minimum date to get registered");
			return;
		}
		
		this.fee();
		
		System.out.print("Pay: " + this.registrationFees + " registration fee:  ");
		this.isPaid = sc.nextBoolean();
		
		if(this.isPaid == false) {
			System.out.println("Pay your registration fees first to get registered.");
			return ;
		}
		
		this.registration = true;
		System.out.println("Vehicle is registered");
	}
	
	/**
	 * This method is used to renew registration
	 */
	void renewRegistration() {
		if(this.registration == false) {
			System.out.println("Your vehicle is not registered to get renewed. Get your "
					+ "vehicle registered first.");
			return;
		}
		
		this.renewRegistration = true;
		System.out.println("Vehicle registration is renewed");
	}
	
	/**
	 * This method is used to transfer ownership of vehicle to another person
	 */
	void transferOwnership() {
		System.out.println("Please enter details of new owner as follows:-");
		System.out.println();
		System.out.print("Enter new owner's first name:  ");
		this.fName = sc.next();
		System.out.print("Enter new owner's last name:  ");
		this.lName = sc.next();
		System.out.print("Enter owner's age:  ");
		this.age = sc.nextInt();
		
		if(this.age < 18) {
			System.out.println("Sorry , This person is not eligible for ownership transfer.");
			return;
		}
		System.out.print("Enter new owner's residence type:  ");
		this.residenceType = sc.next();
		
		System.out.println();
		System.out.println("Ownership of vehicle is transfered to: "
				+ this.fName + " " + this.lName);
	}
	
	
	//Driver/main method
	public static void main(String[] args) {
		DirectorateGeneralXYZ obj1 = new DirectorateGeneralXYZ();
		
		obj1.setDriverDetails();
		obj1.setVehicleDetails();
		
		obj1.vehicleRegistration();
		
		System.out.println();
		obj1.getDrivingLicense();
		
		obj1.renewDrivingLicense();
		
		obj1.renewRegistration();
		
		obj1.transferOwnership();
	}
}
