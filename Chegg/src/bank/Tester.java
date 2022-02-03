package bank;

public class Tester {

	public static void main(String[] args) {
		BankAccount[] accounts = new BankAccount[6];
		accounts[0] = new SavingsAccount("D4051", 6503.5, 0.02);
		accounts[1] = new BankAccount("G7725", 10875.0);
		accounts[2] = new SavingsAccount("K1605", 15794.5, 0.03);
		accounts[3] = new CheckingAccount("E5964", 9624.75);
		accounts[4] = new CheckingAccount("F8723", 3455.5);
		accounts[5] = new SavingsAccount("L8219", 24050.25, 0.025);
		System.out.println("The overall info of the accounts initially:");
		BankManager.printOverallInfo(accounts);
		System.out.println("\nRewarding all the accounts...");
		BankManager.rewardAll(accounts); //no output is printed
		System.out.println("\nDepositing the interest to all saving accounts ...");
		BankManager.depositAllYearlyInterests(accounts); //no output
		System.out.println("\nThe overall info of the accounts at the end of operations:");
		BankManager.printOverallInfo(accounts);
	}

}
