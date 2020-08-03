package com.dollarsbank.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Account extends Customer {

	//linked by UserId
	//private String acctId
	//private String acctType
	private double balance;
	private String password;
	private List<Transaction> transactions;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
		
	public Account(String userId, String password, double balance) {
			super();
			this.userId = userId;
			this.password = password;
			this.balance = balance;
		}
	
	public Account(String userId, String name, String address, String number, String password, double balance) {
		super();
		this.userId = userId;
		this.password = password;
		this.balance = balance;
		this.name = name;
		this.address = address;
		this.number = number;
	}
	


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public void withdraw(double userAmount) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter the amount to deposit from account:");
		
		//input
		input.nextDouble();
		input.close();
		
		double total = this.balance - userAmount;
		
		if(total < 0 ) {
			System.out.println("You can't withdraw that much from your account. Insufficient funds");
		} 
		else{
			this.setBalance(total);
			LocalDateTime currenttimedate = LocalDateTime.now();
			Transaction transaction = new Transaction(userAmount, currenttimedate, Type.WITHDRAW);
			transactions.add(transaction);
		}
	}
	public void deposit(double userAmount) {
			this.balance = this.balance + userAmount;
			LocalDateTime currenttimedate = LocalDateTime.now();
			Transaction transaction = new Transaction(userAmount, currenttimedate, Type.DEPOSIT);
			transactions.add(transaction);
	}
	
	
	/**Transfer funds from one account to the another
	 * */
	public void transferFunds(Account Receiver) {
		/*How much would you like to transfer.
		 * */
		
		
	}

	@Override
	public String toString() {
		return "Account [balance = " + balance + ", password = " + password + ", userId = " + userId + ", name = " + name
				+ ", address = " + address + ", number = " + number + "]";
	}
	
}
