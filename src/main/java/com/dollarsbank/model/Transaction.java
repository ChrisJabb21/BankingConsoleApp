package com.dollarsbank.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

enum Type {
	WITHDRAW,DEPOSIT
}

public class Transaction {
	private double amount;
	private LocalDateTime date;
	private Type type;

	public Transaction(double amount, LocalDateTime date, Type type) {
		this.amount = amount;
		this.date = date;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Transaction [amount=" + amount + ", date=" + date + ", type=" + type + "]";
	}
}
