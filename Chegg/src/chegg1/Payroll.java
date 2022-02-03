package chegg1;

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		
		System.out.println("Press -1 to exit. ");
		
		while(x != -1) {
			System.out.print("\nEnter week:  ");
			x = sc.nextInt();
			
			if(x == -1)
				break;
			
			System.out.print("\nEnter employee's first name:  ");
			String s = sc.next();
			e.getFirstName(s);
			
			System.out.print("Enter employee's last name:  ");
			s = sc.next();
			e.getlastname(s);
			
			System.out.print("Enter marital status:  ");
			s = sc.next();
			e.getStatus(s);
			
//			sc.nextLine();
			
			System.out.print("Enter id:  ");
			int temp = sc.nextInt();
			e.getId(temp);
			
			System.out.print("Enter Hours:  ");
			temp = sc.nextInt();
			e.getHours(temp);
			
			System.out.print("Enter over time:  ");
			temp = sc.nextInt();
			e.getOverTime(temp);
			
			System.out.print("Enter Hourly rate:  ");
			temp = sc.nextInt();
			e.getHourlyrate(temp);
			
			System.out.println("\n\nEmployee's Report");
			System.out.println("------------------\n");
			e.report();
		}
	}

}
