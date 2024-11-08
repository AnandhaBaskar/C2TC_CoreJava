package com.tns.ifet.assignment.banking_transaction_system;

public class BankApplication {

	public static void main(String[] args) {
		Account savings = new SavingsAccount(1000);
        savings.deposit(500);
        savings.withdraw(300);
        savings.displayAccountInfo();

        System.out.println();

        Account checking = new CheckingAccount(1000);
        checking.deposit(200);
        checking.withdraw(150);
        checking.displayAccountInfo();

	}

}
