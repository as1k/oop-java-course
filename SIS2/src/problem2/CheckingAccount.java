package problem2;

class CheckingAccount extends Account{
	
	private int transactionsNum;
	final private int freeTransactions = 5;
	
	public CheckingAccount(int a) {
		super(a);
		transactionsNum = 0;
	}
	
	public void deductFee() {
		int n;
		if(transactionsNum > freeTransactions) {
			n = transactionsNum - freeTransactions;
		}
		else {
			n = 0;
		}
		super.withdraw(n * 0.02);
	}
	
	public int getLeftFreeTransactions() {
		if (this.freeTransactions - this.freeTransactions > 0) {
			return this.freeTransactions -  this.freeTransactions;
		}  
		return 0;
	}
	
	public void deposit(double sum) {
		transactionsNum++;
		super.deposit(sum);
	}
	
	public void withdraw(double sum) {
		if(sum >= super.getBalance()) {
			transactionsNum++;	
		}
		super.withdraw(sum);
	}
	
	public double getBalance() {
		transactionsNum++;
		return super.getBalance();
	}
	
	public double getAccountNumber() {
		transactionsNum++;
		return super.getAccountNumber();
	}
	
	
	public void transfer(double amount, Account other) {
		if(super.getBalance() >= amount) {
			transactionsNum++;
		}
		super.transfer(amount, other);
	}
	
	public String toString() {
		return super.toString() + " \n" +  "Free transactions number is: " + freeTransactions
				+ "\n" + "Number of transactions done by user is: " + transactionsNum + ". ";
	}
}
