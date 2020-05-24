package task1;

abstract class Bank {
	private int customersNumber;
	public Bank(int customersNumber) {
		this.customersNumber = customersNumber;
	}
	
	public int getCustomersNumber() {
		return this.customersNumber;
	}
	
	public void setCustomersNumber(int customersNumber) {
		this.customersNumber = customersNumber;
	}
	
	public abstract int getCreditScore();
}