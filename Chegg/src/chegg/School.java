package chegg;

import java.util.ArrayList;

public class School {
	String name;
	
	//Arraylist of Employee type
	ArrayList<Employee> empList = new ArrayList<>();
	
	School(String name , Employee empList){
		this.name = name;
		this.empList.add(empList);
	}
	
	void addEmployee(Employee emp) {
		empList.add(emp);
	}
	
	ArrayList<Employee> getEmpList() {
		return this.empList;
	}
	
	void display() {
		System.out.println("School : " + this.name);
		System.out.println("Employee List");
		System.out.println("--------------");
		System.out.println();
		
		for(Employee emp : empList) {
			System.out.print(emp + " ");
			
			System.out.println();
			System.out.println();
		}
	}
}
