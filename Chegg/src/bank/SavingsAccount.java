package bank;

public class SavingsAccount extends BankAccount{
    double yearlyInterestRate;
	
	SavingsAccount(String accountId, double balance , double interest) {
		super(accountId, balance);
		
		this.yearlyInterestRate = interest;
	}
	
	void depositYearlyInterest() {
		super.balance += ((this.yearlyInterestRate / 100) * super.getBalance());
	}
	
	String getInfo() {
		return ("Yearly interest rate:  " + this.yearlyInterestRate + "\tAccount Id:  "
				+ this.accountId + "\tBalance:  " + super.getBalance());
	}
}
