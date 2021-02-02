package org.fujitsu.training.codesA;

public class TestSavingsAccount {

	public static void main(String[] args) {

		SavingsAccount savingsAccountReset = new SavingsAccount();
		SavingsAccount savingsAccountSet = new SavingsAccount(1000D, 2D);
		
		savingsAccountSet.addInterest();
		savingsAccountSet.deposit(8000D);
		savingsAccountSet.addInterest();
		savingsAccountSet.withdraw(3000D);
		
	}
}
