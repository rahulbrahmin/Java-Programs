package bank;

public class BankManager {
	
	public static void printOverallInfo(BankAccount[] accounts) {
		for(int i=0 ; i<accounts.length ; i++) {
			System.out.println(accounts[i].getinfo());
		}
	}
	
	public static void rewardAll(BankAccount[] accounts) {
		for(int i=0 ; i<accounts.length ; i++) {
			
			if(accounts[i].getClass().getName() == "bank.SavingsAccount") {
				accounts[i].deposite(50);
			}
			else if(accounts[i].getClass().getName() == "bank.CheckingAccount") {
				accounts[i].deposite(75);
			}
			else {
				accounts[i].deposite(25);
			}
		}
	}
	
	public static void depositAllYearlyInterests(BankAccount[] accounts) {
		
		for(int i=0 ; i<accounts.length ; i++) {
			if(accounts[i].getClass().getName() == "bank.SavingsAccount") {
				
				// calling child class method
				((SavingsAccount)accounts[i]).depositYearlyInterest();
			}
		}
	}
}
