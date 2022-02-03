package emp;

//Driver class
public class MainClass {

	//main method
	public static void main(String[] args) {
		//object of FTprogrammer class
		FTprogrammer ftp = new FTprogrammer("Rudramani Dubey" , 13 , "Male" , 115000 ,
				"25 July 2023" , 12500);
		
		ftp.printInfo();
		
		//object of Retired class
		Retired rt = new Retired("Sweta Jha" , 26 , "Female" , 100000 , "20 August 2023" );
		
		System.out.println();
		rt.printInfo();
	}

}
