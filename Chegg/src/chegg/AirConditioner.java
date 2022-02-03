package chegg;

public class AirConditioner {
	// Constant variables
	static int LOW = 1;
	static int MEDIUM = 2;
	static int HIGH = 3;
	
	// class variables
	private int speed;
	private boolean on;
	private double temperature;
	private String model;
	
	
	// Accessor and mutators
	
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
	 * @return the on
	 */
	public boolean isOn() {
		return on;
	}
	/**
	 * @param on the on to set
	 */
	public void setOn(boolean on) {
		this.on = on;
	}
	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}
	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
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
	
	// Default Constructor
	public AirConditioner(){
		this.speed = 1;
		this.on = false;
		this.temperature = 72.0;
		this.model = "Iceberg";
	}
	
	// Method to return description of AirConditioner
	public String toString() {
		String s = "low";                             // default speed
		if(this.speed == 1)
			s = "low";
		else if(this.speed == 2)
			s = "medium";
		else if(this.speed == 3)
			s = "high";
		
		if(on)
			return "The " + this.model + " is currently set to " 
			+ this.temperature + " degrees Fahrenheit with fan set to " + s  + "." ;
		else
			return "The " + this.model + " is currently turned off.";
	}
}
