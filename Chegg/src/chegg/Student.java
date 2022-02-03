package chegg;

//Student class
public class Student {
	
	//Field variables to store registration number and name of students
	int registrationNumber;
	String name;
	
	//array of type Student that contains registration number and name of each students
	// it can have upto 20 students.
	Student ODDlist[] = new Student[20];
	int count = 0;
	
	//Array to store registration number of students participated in dance.
	int danceList[] = new int[10];
	int danceCount;
	
	//Array to store registration number of students participated in sports.
	int sportsList[] = new int[10];
	int sportsCount;
	
	//Array to store registration number of students participated in music.
	int musicList[] = new int[10];
	int musicCount;
	
	//default constructor
	public Student() {
		
	}
	
	//parameterized constructor
	public Student(int registrationNumber , String name) {
		this.registrationNumber = registrationNumber;
		this.name = name;
	}
	
	//display method to view students at given index
	void display() {
		System.out.print("Name:  " + this.name);
		System.out.print("\tRegistration number:  " + this.registrationNumber );
		
		System.out.println();
	}
	
	/**
	 * This method add details of student 
	 * @param registrationNumber takes registration number of student
	 * @param name takes name os student
	 */
	void add(int registrationNumber , String name) {
		if(count > 20) {
			System.out.println("Array already have 20 values, Can't add more than that!");
			return;
		}
		ODDlist[count] = new Student(registrationNumber , name);
		count++;
	}
	
	/**
	 * This method helps students in registering in several departments
	 * @param department takes name of department in which student want to register
	 * @param registerationNumber takes registration number of student
	 */
	void register(String department , int registerationNumber) {
		int flag = 0;
		
		for(int i=0 ; i<count ; i++) {
			if(ODDlist[i].registrationNumber == registerationNumber) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 0) {
			System.out.println("No Student with this registration number exists. Please Enter a valid registration number!");
			return;
		}
		
		if(department == "dance") {
			danceList[danceCount] = registerationNumber;
			danceCount++;
		}
		else if(department == "sports") {
			sportsList[sportsCount] = registerationNumber;
			sportsCount++;
		}
		else if(department == "music") {
			musicList[musicCount] = registerationNumber;
			musicCount++;
		}
		else {
			System.out.println("Enter a valid department");
		}
	}
	
	/**
	 * This method prints the students those who are registered in all 3 departments.
	 */
	void registered() {
		
		for(int i=0 ; i<count ; i++) {
			
			int temp = ODDlist[i].registrationNumber;
			
			int flag = 0;
			int flag1 = 0;
			int flag2 = 0;
			
			for(int j=0 ; j<sportsCount ; j++) {
				if(temp == sportsList[j]) {
					flag = 1;
					break;
				}
			}
			
				for(int j=0 ; j<musicCount ; j++) {
					if(temp == musicList[j]) {
						flag1 = 1;
						break;
					}
				}
			
				for(int j=0 ; j<danceCount ; j++) {
					if(temp == danceList[j]) {
						flag2 = 1;
						break;
					}
				}
				
				if(flag == 1 && flag1 == 1 && flag2 == 1)
					ODDlist[i].display();
		}
		
			
	}
	
	/**
	 * This method prints students those who are not registered in any of departments.
	 */
	void unregistered() {
		
		for(int i=0 ; i<count ; i++) {
			
			int flag = 0;
			
			int temp = ODDlist[i].registrationNumber;
			
			for(int j=0 ; j<sportsCount ; j++) {
				if(temp == sportsList[j]) {
					flag = 1;
					continue;
				}
			}
			
			for(int j=0 ; j<musicCount ; j++) {
				if(temp == musicList[j]) {
					flag = 1;
					continue;
				}
			}
			
			for(int j=0 ; j<danceCount ; j++) {
				if(temp == danceList[j]) {
					flag = 1;
					continue;
				}
			}
			
			if(flag == 0)
				ODDlist[i].display();
		}
		
	}
	

	// driver/main method
	public static void main(String[] args) {
		//object of Student class
		Student s1 = new Student();
		
		//adding students to s1
		s1.add(125, "Rahul");
		s1.add(128, "Rudra");
		s1.add(135, "Rohan");
		s1.add(156, "Shyam");
		s1.add(154, "John");
		s1.add(178, "Smith");
		s1.add(163, "Mohan");
		s1.add(191, "Rakesh");
		s1.add(113, "Suresh");
		s1.add(103, "Wilson");
		s1.add(175, "Shubham");
		s1.add(188, "Anshu");
		s1.add(159, "Shashank");
		s1.add(154, "Shivam");
		s1.add(129, "Vidhi");
		s1.add(199, "Shruti");
		s1.add(101, "Ritika");
		s1.add(105, "Rohini");
		s1.add(171, "Shalu");
		s1.add(195, "Neha");
		
		//Registering student in their respective departments
		s1.register("sports" , 125);
		s1.register("music" , 154);
		s1.register("dance" , 191);
		s1.register("sports" , 171);
		s1.register("sports" , 135);
		s1.register("music" , 125);
		s1.register("dance" , 171);
		s1.register("dance" , 103);
		s1.register("music" , 171);
		s1.register("sports" , 105);
		s1.register("dance" , 125);
		s1.register("music", 113);
		
		System.out.println("Student registered in all departments are:-  ");
		System.out.println("------------------------------------------- ");
		System.out.println();
		
		s1.registered();
		
		System.out.println("\nStudents not registered in any one of departments are:- ");
		System.out.println("-------------------------------------------------------");
		System.out.println();
		
		s1.unregistered();
	}

}
