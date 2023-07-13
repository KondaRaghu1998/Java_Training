package com.drucare.app.task;

public class Account {

	long accountNumber;
	double amount;

	public Account(long accountNumber) {

		this.accountNumber = accountNumber;

	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void deposit(double money) {

		amount += money;
		System.out.println("Money deposit success...!!! " + money);
	}

	public void withDraw(double money) {
		if (money <= amount) {
			amount -= money;
			System.out.println("Money Withdraw Success,Remaining Balance.. " + amount);
		} else {
			System.out.println("Insufficient amount...!!!!");
		}
	}

}
