package task1;

class anyBank extends Bank{
	private int deposit;
	public anyBank(int customersNumber, int deposit) {
		super(customersNumber);
		this.deposit = deposit;
	}
	
	public int getDeposit() {
		return this.deposit;
	}
	
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
	public int getCreditScore() {
		return 10;
	}
}