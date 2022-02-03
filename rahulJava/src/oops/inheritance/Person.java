package oops.inheritance;

public class Person {
	protected String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Person " + name + " is eating");
	}

	public void walk() {
		System.out.println(name + " is walking");
	}
}
