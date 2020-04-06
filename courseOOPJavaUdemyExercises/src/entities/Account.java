package entities;

public class Account {
	private int accNumber;
	private String accHolder;
	private double accBalance;

	public Account(int accNumber, String accHolder) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
	}

	public Account(int accNumber, String accHolder, double initialDeposit) {
		super();
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		deposit(initialDeposit);
	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void deposit(double amount) {
		accBalance += amount;
	}

	public void withdraw(double amount) {
		accBalance -= amount + 5.00;
	}

	public String toString() {
		return "Account data \n" + "Account: " + accNumber + ", Holder: " + accHolder + ", Balance: $ "
				+ String.format("%.2f", accBalance);
	}
}
