package chegg;


// Parent Class
public class Animal {
	
	//field variable
	boolean vegetarian;
	
	//Method to set vegetarian or not.
	void setVegetarian() {
		this.vegetarian = true;
	}
	
	//method to get vegetarian or not
	boolean isVegetarian() {
		return this.vegetarian;
	}
	
	
	//eat method
	void eat() {
		System.out.println("In the animal class");
		System.out.println("Called the eat() method: I eat!");
	}
}


