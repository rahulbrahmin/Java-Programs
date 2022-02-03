package bank;

public class CheckingAccount extends BankAccount {

	double transactionFee;
	int transcationNumber;
	
	CheckingAccount(String accountId, double balance) {
		super(accountId, balance);
	}
	
	void setTransactionFee(double fee) {
		this.transactionFee = fee;
	}
	
	void payCheck(double amount) {
		super.balance += amount;
	}
	
	String getInfo() {
		return ("Account Id:  " + super.accountId + "\tBalance:  " + this.balance
				+ "\tTransaction Fee:  " + this.transactionFee + "\tTransaction number:  " + this.transcationNumber);
	}
}
