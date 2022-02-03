package chegg;

public class Test {

	public static void main(String[] args) {
		//Object of Teacher type
		Teacher t1 = new Teacher("Rahul Bhardwaj" , 11 , 150000 , "Bachelor");
		
		//Object of Manager type
		Manager m1 = new Manager("Rudramani Dubey" , 25 , 250000 , 4);
		
		System.out.println(t1.toString());
		System.out.println();
		System.out.println(m1.toString());
		
		//Object of School type
		School s1 = new School("CGC" , t1);
		
		Teacher t2 = new Teacher("Shaksham" , 4 , 125000 , "Master");
		Manager m2 = new Manager("Anshu" , 7 , 135000 , 3);
		
		// Adding Employees to School
		s1.addEmployee(m1);
		s1.addEmployee(t2);
		s1.addEmployee(m2);
		
		System.out.println();
		
		// School display method to get entire employee list
		s1.display();
	}

}
