package chegg;

public class Teacher extends Employee {
	String qualification;
	
	Teacher(String name, int id, double baseSalary , String qualification) {
		super(name, id, baseSalary);
		this.qualification = qualification;
	}	

	@Override
	public double calculateSalary() {
		if(this.qualification == "Master")
			return this.baseSalary + (this.baseSalary * 0.40);
		else if(this.qualification == "Bachelor")
			return this.baseSalary + (this.baseSalary * 0.25);
		else
			return this.baseSalary;
	}
	
	public String toString() {
		String str = super.toString();
		str += "\nQualification: " + this.qualification + "\tSalary: " + this.calculateSalary();
		
		return str;
	}

}