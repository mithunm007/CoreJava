package com.assignment5;

public class BankAccount {
	private int accountNumber;
	private double balance;

	public void deposit(double amount) throws InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Deposit amount must be positive.");
		}
		balance += amount;
	}

	public BankAccount(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Withdrawal amount must be positive.");
		}
		if (amount > balance) {
			throw new InsufficientFundsException("Insufficient funds for the withdrawal.");
		}
		balance -= amount;
	}

	// Method to display the account balance
	public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: ₹" + balance);
    }
}
