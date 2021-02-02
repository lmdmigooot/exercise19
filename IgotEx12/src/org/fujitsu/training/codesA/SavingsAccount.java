package org.fujitsu.training.codesA;

public class SavingsAccount {

	private double initialBal;
	private double interestRate;

	public SavingsAccount(Double initialBal, Double interestRate) {
		this.initialBal = initialBal;
		this.interestRate = interestRate;
	}

	public SavingsAccount() {
		initialBal = 0.0;
		interestRate = 0.0;
		System.out.println("Set to 0");
	}

	public void deposit(Double depositAmount) {
		initialBal = depositAmount + initialBal;
		System.out.printf("New balance: %f \n", initialBal);
	}

	public void withdraw(Double withdrawAmount) {
		if (withdrawAmount > initialBal) {
			System.out.println("Insufficient funds.");
		} else {
			initialBal = initialBal - withdrawAmount;
			System.out.printf("New balance: %f \n", initialBal);
		}
	}

	public void addInterest() {
		initialBal = initialBal + ((initialBal * interestRate) / 12);
		System.out.printf("New balance: %f \n", initialBal);
	}
}
