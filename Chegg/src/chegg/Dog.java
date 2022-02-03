package chegg;

//child class
public class Dog extends Animal{

	//field variable
	String breed;
	
	//method to set breed
	void setBreed(String breed) {
		this.breed = breed;
	}
	
	//method to get breed
	String getBreed() {
		return this.breed;
	}
	
	//eat method
	void eat() {
		System.out.println("In the Dog class ");
		System.out.print("Called the eat() method: I eat! But only good food.");
		System.out.println();
	}
	
	
	//main method
	public static void main(String[] args) {
		//object of Animal class
		Animal a = new Animal();
		a.eat();
		
		//Object of Dog class
		Dog d = new Dog();
		
		//method overriding
		d.eat();
		
	}

}
