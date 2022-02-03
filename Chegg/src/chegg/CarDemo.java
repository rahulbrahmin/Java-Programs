package chegg;

public class CarDemo {

	public static void main(String[] args) {
		
		// Part A
		Car AdamCar = new Car();
		Car SarahCar = new Car("Oudi" , "Q81" , 2017 , 110 , "Black" , 9500000);
		
		// Part B
		AdamCar.setMake("Bmmw");
		AdamCar.setModel("A65");
		AdamCar.setYear(2018);
		AdamCar.setSpeed(120);
		AdamCar.setColor("White");
		AdamCar.setPrice(8500000);
		
		// Part C
		System.out.println(AdamCar.getColor());
		System.out.println(SarahCar.getColor());
		
		// Part D
		System.out.println();
		AdamCar.displayFeatures();
		SarahCar.displayFeatures();
		
		//Part E
		AdamCar.accel();
		AdamCar.accel();
		SarahCar.brake();
		
		System.out.println(AdamCar.getSpeed());
		System.out.println(SarahCar.getSpeed());
	}

}
