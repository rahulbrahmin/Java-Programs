package chegg1;

import chegg.AirConditioner;

//Driver class to run Main program
public class Driver {

	public static void main(String[] args) {
		AirConditioner a1 = new AirConditioner();
		a1.setModel("Friginator");
		a1.setSpeed(2);                                          //Set to medium
		a1.setTemperature(69.5);
		a1.setOn(true);                                         // On the AirCondtioner as it is off by default.
		
		System.out.println(a1.toString());
		
		AirConditioner a2 = new AirConditioner();
		
		//no need to set model for this as it is Iceberg by default , you can still enter if you want.
		a2.setOn(true);                                         // On AirConditioner
		a2.setSpeed(3);                                         // set to high
		a2.setTemperature(72.0);
		
		System.out.println(a2.toString());
		
	}

}

