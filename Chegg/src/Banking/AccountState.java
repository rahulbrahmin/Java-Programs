package Banking;

public abstract class AccountState {
	Account account;
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void calculateIntrest();
	public abstract void stateChangeCheck();
	
}
