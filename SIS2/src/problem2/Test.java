package problem2;

class Test {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Account acc1 = new SavingAccount(bank.generateAccNum(), 15);
		bank.openAccount(acc1);
		acc1.deposit(9200000);
		
		Account acc2 = new CheckingAccount(bank.generateAccNum());
		bank.openAccount(acc2);
		acc2.deposit(45000);
		acc2.deposit(12000);
		acc2.deposit(3000);
		
		Account acc3 = new Account(bank.generateAccNum());
		bank.openAccount(acc3);
		acc3.deposit(55);

		acc1.transfer(23000, acc2);
		acc2.transfer(500, acc3);
		acc2.transfer(500, acc1);
		acc2.deposit(1000); //6th operation
		
		bank.update();
		acc1.print();
		acc2.print();
		acc3.print();
	}
}
