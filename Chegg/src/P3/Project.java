package P3;

import P1.Stu;
import P2.Dept;

public class Project {
	String title;
	String projDepartment;
	Dept department;
	Stu student;
	
	public Project() {
		
	}
	
	public Project(String title , String projDepartment , Dept department , Stu student) {
		this.title = title;
		this.projDepartment = projDepartment;
		this.department = department;
		this.student = student;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the projDepartment
	 */
	public String getProjDepartment() {
		return projDepartment;
	}
	/**
	 * @param projDepartment the projDepartment to set
	 */
	public void setProjDepartment(String projDepartment) {
		this.projDepartment = projDepartment;
	}
	/**
	 * @return the department
	 */
	public Dept getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Dept department) {
		this.department = department;
	}
	/**
	 * @return the student
	 */
	public Stu getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Stu student) {
		this.student = student;
	}
	
	public void display() {
		System.out.println("Title: " + this.getTitle());
		System.out.println("Project's Department: " + this.getProjDepartment());
		System.out.println("Student: " + this.student.getName());
		System.out.println("Student's Department: " + this.department.getName());
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Stu s1 = new Stu("Rahul Bhardwaj" , 35 , "Male");
		Dept d1 = new Dept("Computer Science" , 1);
		
		Project p1 = new Project("Library Management System" , "Computer Science" , d1 , s1);
		
		System.out.println("Project 1 Description:-");
		System.out.println("------------------------");
		p1.display();
		
		Stu s2 = new Stu();
		s2.setName("Shubham Kumar Jha");
		s2.setRollNo(40);
		s2.setGender("Male");
		
		Dept d2 = new Dept();
		d2.setName("Information Techology");
		d2.setId(2);
		
		Project p2 = new Project();
		p2.setTitle("E Commerce Website");
		p2.setProjDepartment("Information Technology");
		p2.setDepartment(d2);
		p2.setStudent(s2);
		
		System.out.println("Project 2 Description:-");
		System.out.println("------------------------");
		p2.display();
	}
}
