package com.dollarsbank.utility;

import java.util.ArrayList;
import java.util.List;

import com.dollarsbank.model.Account;
import com.dollarsbank.model.Customer;

/** Class for setting up test data
 * for login and functionality testing
 * */
public class DataGeneratorStubUtil {

	/**
	 * Method providing some mock data for models: test accounts and customers
	 */
	public void testAccounts() {	
	 List<Account> accounts = new ArrayList<Account>();
	 List<Customer> customers = new ArrayList<Customer>();
	 customers.add(new Customer("U000001", "Chris Jabbour", "USA", "1-724-789-1011"));
	 customers.add(new Customer("U112233", "Fouad Jabbour", "Lebanon", "1-724-123-0000"));
	 customers.add(new Customer("U252525", "Victor Jabbour", "Lebanon", "1-724-XXX-XXXX"));
	 accounts.add(new Account("U000001", "P455word!", 50000.00));
	 accounts.add(new Account("U112233", "Shadowmose5!", 5000.00));
	 accounts.add(new Account("U252525", "L3b@n0n!", 5000.00));
	}
	 //Map<Account> accounts;
	//test
	 
		//Account test = new Account();
	
	
}
