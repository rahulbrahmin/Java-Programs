package oops.abstraction;

public class RepairCar {
	
	public static void repairCar(Car car) {
		
		System.out.println("Car is repaired");
		
	}
	

	public static void main(String[] args) {
		
		WagonR wagonR = new WagonR();
		Audi audi = new Audi();
		
		repairCar(wagonR);
		repairCar(audi);
		
		audi.accelerate();
		audi.breaking();

	}

}
