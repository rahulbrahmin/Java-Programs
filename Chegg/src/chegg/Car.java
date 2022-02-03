package chegg;

//Car Class
public class Car {
	//Private variables
	private String make;
	private String model;
	private int year;
	private int speed;
	private String color;
	private double price;
	
	//Default Constructor
	Car(){
		
	}
	
	//Parameterized Constructor
	Car(String make , String model , int year , int speed , String color , double price){
		this.make = make;
		this.model = model;
		this.year = year;
		this.speed = speed;
		this.color = color;
		this.price = price;
	}
	
	//accel method
	void accel() {
		this.speed += 10;
	}
	
	//brake method
	void brake() {
		this.speed -= 10;
	}
	
	//Display Feature Method
	void displayFeatures() {
		System.out.println("Make      Model      Year      Speed      Color      Price");
		System.out.println("----      -----      ----      -----      -----      -----");
		System.out.println(this.getMake() +"      " + this.getModel() + "        " + 
		this.getYear() + "      " + this.getSpeed() + "        " + this.getColor() + "      " + this.getPrice());
		System.out.println();
	}

	//Mutators and Accessors
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
}
