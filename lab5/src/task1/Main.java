package task1;

class Main {
	public static void main(String[] args) {
		anyBank ab = new anyBank(700000, 6500000);
		System.out.println("Customers number is " + ab.getCustomersNumber());
		System.out.println("Deposit is " + ab.getDeposit());
		System.out.println("Current credit score is " + ab.getCreditScore() + "\n");
		
		SomePerson p = new SomePerson();
		p.speedInfo();
		p.jumping(3, 3);
		p.running(3, 3);
		p.move(3, 3);
	}
}