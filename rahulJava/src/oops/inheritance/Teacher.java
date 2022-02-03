package oops.inheritance;

public class Teacher extends Person{
	
	public Teacher(String name) {
		super(name);
		System.out.println("In Teacher's Constructor");
		
	}

	public void teach() {
		super.eat();
		System.out.println(name + " is teaching");
	}
}
