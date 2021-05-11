package entities;

public class Account {

	private int numberAccount;
	private String holderAccount;
	private double balance;
	private double withdrawLimit;
	
	public Account(int numberAccount, String holderAccount, double balance, double withdrawLimit) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getHolderAccount() {
		return holderAccount;
	}

	public void setHolderAccount(String holderAccount) {
		this.holderAccount = holderAccount;
	}

	public double getInitialBalance() {
		return balance;
	}

	public void setInitialBalance(double initialBalance) {
		this.balance = initialBalance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public double deposit(double amount) {
		return this.balance = balance + amount;
	}
	
	public double withdraw(double amount) {
		if(amount > withdrawLimit) {
			throw new IllegalArgumentException("You can't withdraw more than you have.");
		}
		return this.balance = balance - amount;
	}

	@Override
	public String toString() {
		return "Account number: " + numberAccount + "\nHolder: " + holderAccount
				+ "\nBalance: " + String.format("%.2f", balance)
				+ "\nWithdraw Limit:" + String.format("%.2f", withdrawLimit);
	}
	
}
