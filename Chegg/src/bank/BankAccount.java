package bank;

public class BankAccount {
	String accountId;
	double balance;
	
	BankAccount(String accountId , double balance){
		this.accountId = accountId;
		this.balance = balance;
	}
	
	double getBalance() {
		return this.balance;
	}
	
	void deposite(double amount) {
		this.balance += amount;
	}
	
	void withdraw() {
		this.balance = 0;
	}
	
	String getinfo() {
		return ("Account Id:  " + this.accountId + "\tBalance:  " + this.balance);
	}
}
