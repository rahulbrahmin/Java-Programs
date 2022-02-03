package oops.abstraction;

public abstract class Car {
	
	public abstract void accelerate();
	
	public abstract void breaking();
	
	public static void honk() {
		System.out.println("Car is honking");
	}
}
