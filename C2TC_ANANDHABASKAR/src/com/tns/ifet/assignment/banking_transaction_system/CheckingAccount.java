package com.tns.ifet.assignment.banking_transaction_system;

public class CheckingAccount extends Account {
	public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

}
