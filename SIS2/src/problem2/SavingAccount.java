package problem2;

class SavingAccount extends Account{
	private double interestRate;
	
	public SavingAccount(int a, double interestRate) {
		super(a);
		this.interestRate = interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void addInterest() {
		super.deposit(super.getBalance() * ((1 + interestRate) / 100));
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
	}
	
	public double getBalance() {
		return super.getBalance();
	}
	
	public double getAccountNumber() {
		return super.getAccountNumber();
	}
	
	public void transfer(double amount, Account other) {
		super.transfer(amount, other);
	}
	
	public String toString() {
		return super.toString() + " \n" + "The interest rate is: " + interestRate + ". ";
	}
}