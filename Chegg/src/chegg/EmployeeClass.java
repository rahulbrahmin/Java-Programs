package chegg;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * This class contains main method where all functionalities are implemented
 * @author RUDRAMANI DUBEY
 *
 */
public class EmployeeClass {

	public static void main(String[] args) {
		
		/**
		 * To take inputs from user
		 */
		Scanner sc = new Scanner(System.in);
		
		/**
		 * These array lists will be used to store all the details of employees
		 * so that they can be printed after the loop gets over.
		 */
		ArrayList<Integer> totalHours = new ArrayList<>();
		ArrayList<Float> totalGrossPay = new ArrayList<>();
		ArrayList<Float> totalTax = new ArrayList<>();
		ArrayList<Float> totalNetPay = new ArrayList<>();
		
		int x = 0;
		
		/**
		 * We have taken our sentinel value as 1 to exit the loop
		 */
		while(x != 1) {
			System.out.print("Enter 1 to exit else any other integer value to continue:  ");
			x = sc.nextInt();
			sc.nextLine();
			
			if(x == 1)
				break;
			
			System.out.print("\nEnter Employee's name:  ");
			String name = sc.nextLine();
			
			System.out.print("Enter hourly wage of employee:  ");
			int wage = sc.nextInt();
			
			System.out.print("Enter total hours worked by employee:  ");
			int hours = sc.nextInt();
			
			float grossPay = (wage * hours);
			
			int taxPercent = 0;
			
			/**
			 * Calculating tax percentage on each employees on basis of there gross pay
			 */
			if(grossPay >=0.00 && grossPay <= 300.00) 
				taxPercent = 10;
			else if(grossPay>= 300.01 && grossPay <= 550.00)
				taxPercent = 13;
			else if(grossPay >= 550.01 && grossPay <= 800.00)
				taxPercent = 16;
			else 
				taxPercent = 20;
			
			float taxAmount = ((taxPercent * grossPay) / 100);
			
			float netPay = (grossPay - taxAmount);
			
			System.out.println("\nEmployee's Details");
			System.out.println("------------------");
			
			System.out.println("\nName:            " + name);
			System.out.println("Hourly wage:     " + wage);
			System.out.println("Hourls Worked:   " + hours);
			System.out.println("Gross pay:       " + grossPay);
			System.out.println("Tax Percentage:  " + taxPercent);
			System.out.println("Tax Amount:      " + taxAmount);
			System.out.println("Net Pay:         " + netPay + "\n");
			
			totalHours.add(hours);
			totalGrossPay.add(grossPay);
			totalTax.add(taxAmount);
			totalNetPay.add(netPay);
		}
		
		System.out.println("\nDetails of All employees");
		System.out.println("--------------------------");
		
		int sum = 0;
		for(int i : totalHours)
			sum += i;
		
		System.out.println("\nTotal Hours worked by all employees:   " + sum);
		
		float sum1 = 0;
		
		for(float i : totalGrossPay)
			sum1 += i;
		
		System.out.println("Total Gross pay of all employees:       " + sum1);
		
		sum1 = 0;
		for(float i : totalTax)
			sum1 += i;
		
		System.out.println("Total withholding for all employees:    " + sum1);
		
		sum1 = 0;
		for(float i : totalNetPay)
			sum1 += i;
		
		System.out.println("Total Net Payroll of all employees:     " + sum1);
	}

}
