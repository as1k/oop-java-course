package problem2;

class Account {
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance = 0.0;
		accNumber = a;
	}
	
	public void deposit(double sum) {
		this.balance += sum;
	}
	
	public void withdraw(double sum) {
		if(this.balance < sum) {
			System.out.println("Sorry, not enough money to complete operation. Please replenish your account.");
		}
		else {
			this.balance -= sum;
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getAccountNumber() {
		return this.accNumber;
	}
	
	public void transfer(double amount, Account other) {
		if(this.balance < amount) {
			System.out.println("Sorry, not enough money to complete operation. Please replenish your balance.");
		}
		else {
			this.balance -= amount;
			other.balance += amount;
		}
	}
	
	public String toString() {
		return "Account Number is: " + accNumber + ", Deposit balance is: " + balance + ".";
	}
	
	public final void print() {
		System.out.println(toString());
	}
}