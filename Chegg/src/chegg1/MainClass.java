package chegg1;

public class MainClass {

	// main/driver method
	public static void main(String[] args) {
		// Object of ItStudent
		ItStudent st = new ItStudent(151 , "Rahul Bhardwaj" , "B.tech" , 8.85);
		
		System.out.println(st.calcGPA(4));
		
		System.out.println(st.getStatus());
		System.out.println(st.toString());
		
		// Object of Student class
		Student st2 = new Student();
		
		st2.setId(105);
		st2.setName("Rudramani Dubey");
		
		ItStudent st3 = new ItStudent(st2.getId() , st2.getName() , "B.tech" , 8.76);
		
		System.out.println(st3.toString());
	}

}
