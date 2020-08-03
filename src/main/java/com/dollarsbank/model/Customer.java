package com.dollarsbank.model;

import java.util.List;

public class Customer {
	protected String userId;
	protected String name;
	protected String address;
	protected String number;
	
	private List<Account> accounts;
	
	public Customer(){}
	
	public Customer(String userId, String name, String address, String number) {
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public Customer(String name, String address, String number) {
		this.name = name;
		this.address = address;
		this.number = number;
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	//User as print customer information.
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", name=" + name + ", address=" + address + ", number=" + number
				+ ", accounts=" + accounts + "]";
	}
	
	
	
}
