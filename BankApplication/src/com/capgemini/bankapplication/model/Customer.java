package com.capgemini.bankapplication.model;

public class Customer {
	private String customerId;
	private String customerName;
	private String password;
	private String email;
	private String address;
	private int dateOfBirth;
	private long customeraccount;
	public Customer() {
		super();
	}
	public Customer(String customerId, String customerName, String password, String email, String address,
			int dateOfBirth, long customeraccount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.customeraccount = customeraccount;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getCustomeraccount() {
		return customeraccount;
	}
	public void setCustomeraccount(long customeraccount) {
		this.customeraccount = customeraccount;
	}
	

}
