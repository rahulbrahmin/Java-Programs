package oops.inheritance;

public class Singer extends Person{
	
	public void sing() {
		System.out.println(name + " is singing");
	}
	
	public Singer(String name) {
		super(name);
		System.out.println("In Singer's Constructor");
	}
	
	public void walk() {
		System.out.println("Singer " + name + " is walking while Singing.");
	}
}
