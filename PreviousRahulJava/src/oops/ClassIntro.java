package oops;

class Dog{
	boolean hasFur;
	String name,breed;
	//int legs,eyes;
	
	public void eat() {
		System.out.println("Dog is eatng");
	}
	
	public void jump() {
		System.out.println("Dog is jumping");
	}
	
	public void description() {
		System.out.println("My dog name is "+name+" and its breed is "+breed);
	}
}

class Cat{
	boolean hasFur;
	String name,breed;
	int legs,eyes;
	
	public void eat() {
		System.out.println("Cat is eatng");
	}
	
	public void walk() {
		System.out.println("Cat is jumping");
	}
	
	public void description() {
		System.out.println("My cat has "+legs+" legs and "+eyes+" eyes");
	}
}


public class ClassIntro {

	public static void main(String[] args) {
		
		Cat c1=new Cat();
		Dog d1=new Dog();
		
		c1.hasFur=true;
		c1.legs=4;
		c1.eyes=2;
		System.out.println("Cat's Description:-");
		c1.walk();
		c1.eat();
		c1.description();
		System.out.println(c1.hasFur);
		System.out.println();
		System.out.println("Dog's Description:-");
		d1.hasFur=true;
		d1.name="Browny";
		d1.breed="Husky";
		
		d1.eat();
		d1.jump();
		d1.description();
		System.out.println(d1.hasFur);
	}

}
