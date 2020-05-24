package problem2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

class Bank {
	private ArrayList<Account> accountsSet = new ArrayList<Account>();
	public Bank() {
	}
	
	public ArrayList<Account> getAccountsSet() {
		return this.accountsSet;
	}
	
	/*
	public void update() {
		Iterator it = accountsSet.iterator();

		while(it.hasNext()) {
			if(it.next() instanceof SavingAccount) {
				SavingAccount sa = (SavingAccount) it.next();
				sa.addInterest();
			}
			else if(it.next() instanceof CheckingAccount) {
				CheckingAccount ca = (CheckingAccount) it.next();
				ca.deductFee();
			}
		}
	}
	*/
	public void update() {
		for (Account a : accountsSet) {
			if (a instanceof SavingAccount) {
				SavingAccount sa = (SavingAccount)a;
				sa.addInterest();
			} 
			else if (a instanceof CheckingAccount) {
				CheckingAccount ca = (CheckingAccount)a;
				ca.deductFee();
			}
		}
	}
		
	public void openAccount(Account account) {
		accountsSet.add(account);
	}
	
	public void closeAccount(Account account) {
		accountsSet.remove(account);
		accNums.remove(account.getAccountNumber());
	}

	Vector accNums = new Vector();
	
	public boolean CheckForAccNum(int randomAccNumber) {
		if(accNums.contains(randomAccNumber)) {
			return false;
		}
		return true;
	}
	
	public int generateAccNum() {
		int first7 = (int) (Math.random() * 10000000L);
		int randomAccNumber = (int) (520000000L + first7);
		while(CheckForAccNum(randomAccNumber)) {
			return randomAccNumber;
		}
		return generateAccNum();
	}
}