package com.dollarsbank.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import com.dollarsbank.application.Menu;
import com.dollarsbank.utility.ColorsUtility;

public class Account extends Customer {
	
	Menu menu = new Menu();
	//linked by UserId
	//private String acctId
	//private String acctType
	private double balance;
	private String password;
	private List<Transaction> transactions;


	public Account(){}

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

	public void withdraw() {
		Scanner input = new Scanner(System.in);
		double userAmount = 0;
		System.out.println("Enter amount to withdraw");
		//input
		userAmount = input.nextDouble();
		input.close();
		
		
		double total = this.balance - userAmount;
		
		if(total < 0) {
			System.out.println("You can't withdraw that much from your account with "+ userAmount + " Insufficient funds");
		} 
		else{
			this.setBalance(total);
			LocalDateTime currenttimedate = LocalDateTime.now();
			Transaction transaction = new Transaction(userAmount, currenttimedate, Type.WITHDRAW);
			transactions.add(transaction);
		}
	}
	public void deposit() {
		
		Scanner input = new Scanner(System.in);
		double userAmount = 0;
		System.out.println("Enter amount to deposit");
		userAmount = input.nextDouble();
		input.close();			
			
		double total = this.balance + userAmount;
		LocalDateTime currenttimedate = LocalDateTime.now();
		Transaction transaction = new Transaction(userAmount, currenttimedate, Type.DEPOSIT);
		transactions.add(transaction);
			
	}
	
	
	
	
	public void viewTransactions() {
		for(Transaction t: transactions)
		{
			System.out.println(t);
		}
		
	}

	@Override
	public String toString() {
		return "Account [balance = " + balance + ", password = " + password + ", userId = " + userId + ", name = " + name
				+ ", address = " + address + ", number = " + number + "]";
	}
	
	
	
}