package com.assignment5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        BankAccount account = new BankAccount(14234, 4000.0);

        // Demonstration of deposit operation
        try {
            account.deposit(500.0);
            account.displayBalance();
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Deposit operation completed.");
        }

        // Demonstration of withdrawal operation
        try {
            account.withdraw(5000.0);
            account.displayBalance();
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Withdrawal operation completed.");
        }

        // Another withdrawal with sufficient funds
        try {
            account.withdraw(200.0);
            account.displayBalance();
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Second withdrawal operation completed.");
        }

	}

}
