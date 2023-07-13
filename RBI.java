package com.drucare.app.task;

public class RBI {

	double minInterestRate;
	double minBalanceAllow;
	double minBalanceWithdrawalLimit;
	Customer customer;
	Account account;
	
	public RBI() {
		// TODO Auto-generated constructor stub
	}

	public RBI(double minInterestRate, double minBalanceAllow, double minBalanceWithdrawalLimit, Customer customer,
			Account account) {

		this.minInterestRate = minInterestRate;
		this.minBalanceAllow = minBalanceAllow;
		this.minBalanceWithdrawalLimit = minBalanceWithdrawalLimit;
		this.customer = customer;
		this.account = account;
	}

	public double getMinInterestRate() {
		return minInterestRate;
	}

	public void setMinInterestRate(double minInterestRate) {
		this.minInterestRate = minInterestRate;
	}

	public double getMinBalanceAllow() {
		return minBalanceAllow;
	}

	public void setMinBalanceAllow(double minBalanceAllow) {
		this.minBalanceAllow = minBalanceAllow;
	}

	public double getMinBalanceWithdrawalLimit() {
		return minBalanceWithdrawalLimit;
	}

	public void setMinBalanceWithdrawalLimit(double minBalanceWithdrawalLimit) {
		this.minBalanceWithdrawalLimit = minBalanceWithdrawalLimit;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "RBI [minInterestRate=" + minInterestRate + ", minBalanceAllow=" + minBalanceAllow
				+ ", minBalanceWithdrawalLimit=" + minBalanceWithdrawalLimit + ", customer=" + customer + ", account="
				+ account + "]";
	}

}
