package com.drucare.app.task;

public class SBI extends RBI {

	String bankName;

	public SBI(double minInterestRate, double minBalanceAllow, double minBalanceWithdrawalLimit, Customer customer,
			Account account) {
		super(minInterestRate, minBalanceAllow, minBalanceWithdrawalLimit, customer, account);
	}

	public void displayBankName() {
		System.out.println("Bank Name :: " + bankName);
	}

}
