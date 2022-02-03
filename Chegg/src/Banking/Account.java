package Banking;


public class Account {
	AccountState state;
	String owner;
	double balance;
	
	Account(String owner , double balance){
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance = amount;
	}
	
	public void calculateIntrest() {
		
	}
	
	public void stateChangeCheck() {
		if(this.balance > 0 && this.balance <= 20000) {
			this.state = new NormalAccountState();
		}else if(this.balance <=0 ) {
			this.state = new RestrictedAccountState();
		}else {
			this.state = new GoldAccountState();
		}
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setState(AccountState state) {
		this.state = state;
	}
}


