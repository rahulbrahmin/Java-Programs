package string;

public class StringIntro {

	public static void main(String[] args) {
		
		String name="Rahul Bhardwaj";
		String dj="";
		String name1=new String("Rahul");
		String cars= "BMW,Audi,Mercedes,Lamborghini,Fortuner,Bugati,Zest";
		String Dj="     Rudra        ";
		System.out.println(name==name1);
		System.out.println(name.charAt(2));
		System.out.println(name.length());
		System.out.println(name.substring(5));
		System.out.println(name.substring(5,10));
		System.out.println(name.contains("Rahul"));
		System.out.println(name.equals(name1));
		System.out.println(dj.isEmpty());
		System.out.println(name1.concat(" Bhardwaj"));
		System.out.println(name.replace('R','r'));
		String allCars[]=cars.split(",");
		for(String car:allCars) {
			System.out.println(car);
	}
		System.out.println(name.indexOf('R'));
		System.out.println(name1.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(Dj.trim());
		

}
}