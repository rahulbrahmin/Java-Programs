package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		Teacher t = new Teacher("Rahul");
//		
//		t.name = "Rubal Jeet";
//		t.eat();
//		t.walk();
//		t.teach();
		
		Singer s = new Singer("Yo Yo Honey Singh");
//		
//		//s.name = "Yo Yo Honey Singh";
//		s.walk();
//		s.sing();
		
		Person p = s;
		 
		Singer s1 = (Singer) p;
		
		System.out.println(t instanceof Teacher);
		System.out.println(s instanceof Singer);
		System.out.println(p instanceof Teacher);
		System.out.println(s1 instanceof Person);
	}

}
