package com.capgemini.bankapplication.model;

public class BankAccount {

	private String accountId;
	private String accountType;
	private long balance;
	
	
	public BankAccount() {
		super();
	}
	public BankAccount(String accountId, String accountType, long balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

}
