package com.dollarsbank.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.dollarsbank.application.Menu;
import com.dollarsbank.model.Account;
import com.dollarsbank.utility.ColorsUtility;

public class DollarsBankController {
	Scanner input = new Scanner(System.in);
	Menu menu = new Menu();


	//business logic layer.

	//TODO add DAO implementation classes to inject objects from database 
	//TODO add persistence functionality and layer.
	
	private List<Account> accounts;
	
	public DollarsBankController() {
		accounts = new ArrayList<Account>();
		testData();
	}
	
	
	public void testData() {
		try {
			//TODO Check if my objects are being added to my list properly.
			 accounts.add(new Account("U000001", "Chris Jabbour", "USA", "1-724-789-1011", "P455word!", 50000.00));
			 accounts.add(new Account("U112233", "Fouad Jabbour", "Lebanon", "1-724-123-0000", "Shadowmose5!", 5000.00));
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	public void Create() {
	System.out.println(ColorsUtility.BLUE+
	"+--------------------------------+\r\n" + 
	"| Enter Details for New Account! |\r\n" + 
	"+--------------------------------+" 
	+ ColorsUtility.RESET);

	System.out.println("Customer Name: ");
	String cust_name = input.nextLine();
	
	System.out.println("Customer Address: ");
	String addr = input.nextLine();
	
	System.out.println("Customer Contact Number: ");
	String number = input.nextLine();
	
	System.out.println("User Id (UXXXXXX): ");
	String userid = input.nextLine();
	
	System.out.println("Password (8 characters with lower, upper, & special characters) :");
	String pass = input.nextLine();
	
	System.out.println("Initial Deposit Amount");
	double balance = Double.parseDouble(input.nextLine());
	input.close();
	
	
	//TODO fix exceptions with adding user inputed object to data struct. if true
	//TODO Refactor below to less lines
	Account account = new Account();
		account.setUserId(userid); 
		account.setName(cust_name); 
		account.setAddress(addr);
		account.setNumber(number);
		account.setUserId(userid);
		account.setPassword(pass);
		account.setBalance(balance);
		
		addAccount(account);
		System.out.println("customer added.");
		menu.StartMenu();
	
	}
	
	public void addAccount(Account a) {accounts.add(a);}
	
	//TODO Refactor to take and return customer object with all details to Customer menu function.
	public void Login() {
		String userId = "";
		String password = "";


		//test
//		Account test = new Account("U000001", "P455word!");
		
		System.out.println(ColorsUtility.BLUE +
		" +---------------------+\r\n" + 
		" | Enter Login Details |\r\n" + 
		" +---------------------+" + ColorsUtility.RESET);
		
		System.out.println("User Id :");
		userId = input.nextLine();

		System.out.println("Password :");
		password = input.nextLine();
		input.close();
		
		//test statement userId.equals(test.getUserId()) && password.equals(test.getPassword())
		
		//TODO loop through accounts and look for a matching userId and Password // inject the list of accounts
		for(int i = 0; i < accounts.size(); i++) {
		if(accounts.get(i).getUserId().equals(userId) && accounts.get(i).getUserId().equals(password))
		{
			System.out.println("Login success");
			//create and set object for the logged in account with all properties and send it to welcome menu
			
			WelcomeMenu();
		}
		else {
			Login();
			System.out.println(ColorsUtility.RED + "Invalid credentials, Try again!" + ColorsUtility.RESET);
		}
	}
}
		
	/*Account*/
	public void WelcomeMenu() {
		 //Scanner scan = new Scanner(System.in);
			System.out.println(ColorsUtility.BLUE+
				 "+--------------------+\r\n" + 
				 "| Welcome customer ! |\r\n" + 
				 "+--------------------+" + ColorsUtility.RESET);
		 System.out.println(
				 "1. Deposit Amount \r\n"+
				 "2. Withdraw Amount \r\n"+
				 "3. funds transfer \r\n" + 
		 		 "4. View 5 recent transaction history\r\n" + 
		 		 "5. Display customer information\r\n" + 
		 		 "6. Sign Out \r\n");
		 
		 System.out.println(ColorsUtility.GREEN + "Enter Choice (1, 2, 3, 4, 5, or 6) :" + ColorsUtility.RESET);
		
		  int choice = input.nextInt(); 
		  switch(choice) { 
		  case 1: //deposit 
			  break;
		  case 2: // withdraw from account 
			  break; 
		  case 3: //transfer funds 
			  break; 
		  case 4: // view recent transactions 
			  break; 
		  case 5: // display customer info 
			  break;
		  case 6: // sign out 
			  break; 
		  
		  default:
		  System.out.println("Invalid input. Enter a number from below.");
		  WelcomeMenu(); 
		  break; 
		  }
		  System.out.println("Invalid Input"); 
		  input.nextLine();
		}
}