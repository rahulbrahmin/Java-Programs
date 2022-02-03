package chegg;

public abstract class Employee implements Worker {
	String name;
	int id;
	double baseSalary;
	
	Employee(String name , int id , double baseSalary){
		this.name = name;
		this.id = id;
		this.baseSalary = baseSalary;
	}
	
	public String toString() {
		return ("Name: " + this.name + "\tId: " + this.id);
	}

	@Override
	public abstract double calculateSalary();
}


