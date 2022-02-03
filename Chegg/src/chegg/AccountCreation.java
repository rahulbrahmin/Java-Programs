package chegg;
import java.math.*;

import java.util.Scanner;

public class AccountCreation {
	
	Scanner sc = new Scanner(System.in);
	
	private String fName;
	private String Lname;
	private String password;
	private String cnfPassword;
	int flag = 0;
	private String userName = "";
	
	AccountCreation(String fName ,String lName , String password){
		this.fName = fName;
		this.Lname = lName;
		this.password = password;
		
		if(password.equals(this.fName) || password.equals(this.Lname) || 
				password.equals(this.fName.toUpperCase()) || 
				password.equals(this.fName.toLowerCase()) || 
				password.equals(this.Lname.toUpperCase()) ||
				password.equals(this.Lname.toLowerCase())) {
			System.out.println("Error !");
			System.out.println("Password may not be same as first name or last name");
			System.out.println("Try again");
		}else if(password.length() < 8) {
			System.out.println("Error !");
			System.out.println("Password length should must be atleast 8");
		}else {
			System.out.println("Enter again: ");
			cnfPassword = sc.nextLine();
			
			if(!cnfPassword.equals(password)) {
				System.out.println("Password doesn't match");
				System.out.println("Try again");
			}else {
				flag = 1;
			}
		}
		
		if(flag == 1) {
			System.out.println("Account was created succesfully");
			if(this.Lname.length() < 5) {
				this.userName += this.Lname.toLowerCase();
			}else {
				this.userName += this.Lname.substring(0 , 5).toLowerCase();
			}
			
			int min = 0;
			int max = 99;
			
			this.userName += this.fName.substring(0 , 1).toLowerCase();
			int a = (int) (Math.random()*(max-min+1) + min);
			int b = (int) (Math.random()*(max-min+1) + min);
			
			
			if(a>=10 && b>=10) {
				this.userName += Integer.toString(a);
			}
			else if(a<10) {
				this.userName += Integer.toString(a) + Integer.toString(b).substring(0 , 1);
			}
			
			System.out.println("Your Username is : " + this.userName);
		}
	}
	
	

	public static void main(String[] args) {
		AccountCreation at = new AccountCreation("Rahul" , "Dubey" , "Dj@58624");
		System.out.println();
		AccountCreation at1 = new AccountCreation("Rahul" , "Dubey" , "Dj@");
		System.out.println();
		AccountCreation at2 = new AccountCreation("Rahul" , "Dubey" , "rahul");

	}

}
