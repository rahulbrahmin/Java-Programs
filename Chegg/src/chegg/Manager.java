package chegg;

public class Manager extends Employee {
	int yearOfService;
	
	Manager(String name, int id, double baseSalary , int yearOfService) {
		super(name, id, baseSalary);
		this.yearOfService = yearOfService;
	}

	@Override
	public double calculateSalary() {
		if(this.yearOfService <= 1)
			return this.baseSalary * (this.baseSalary * 0.25);
		else if(this.yearOfService > 1 && this.yearOfService <= 5)
			return this.baseSalary + (this.baseSalary * 0.4);
		else
			return this.baseSalary + (this.baseSalary * 0.65);
	}
	
	public String toString() {
		String str = super.toString();
		str += "\nYear of Service: " + this.yearOfService + "\tSalary" + this.calculateSalary();
		
		return str;
	}
}
