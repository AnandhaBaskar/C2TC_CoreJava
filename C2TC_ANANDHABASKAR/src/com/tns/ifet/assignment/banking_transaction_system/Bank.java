package com.tns.ifet.assignment.banking_transaction_system;

public class Bank {
	private static int totalAccounts = 0;
	 public Bank() {
	     totalAccounts++;
	 }


	 public static int getTotalAccounts() {
	     return totalAccounts;
	 }

	 public static void main(String[] args) {
	     Bank account1 = new Bank();
	     Bank account2 = new Bank();
	     Bank account3 = new Bank();
	     System.out.println("Total bank accounts created: " + Bank.getTotalAccounts());
	 }

}
