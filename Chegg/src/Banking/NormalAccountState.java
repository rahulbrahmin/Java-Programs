package Banking;

public class NormalAccountState extends AccountState {
	
	Account a1;

	@Override
	public void deposit(double amount) {
		if(a1.balance > 0 || a1.balance < 20000) {
			a1.balance += a1.balance += amount;
		}
		
	}

	@Override
	public void withdraw(double amount) {
		if(a1.balance > 0) {
			a1.balance = a1.balance -= amount;
		}
	}

	@Override
	public void calculateIntrest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stateChangeCheck() {
		if(a1.balance > 0 && a1.balance <= 20000) {
			a1.state = new NormalAccountState();
		}else if(a1.balance <=0 ) {
			a1.state = new RestrictedAccountState();
		}else {
			a1.state = new GoldAccountState();
		}
	}
	
}
