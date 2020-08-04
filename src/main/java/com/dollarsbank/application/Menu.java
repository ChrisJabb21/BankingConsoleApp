package com.dollarsbank.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.dollarsbank.controller.DollarsBankController;
import com.dollarsbank.utility.ColorsUtility;

public class Menu {
	DollarsBankController dbc =  new DollarsBankController();

	Scanner scan = new Scanner(System.in);

	public void startMenu() throws InputMismatchException {
	

			System.out.println(
			"1. Create New Account. \n" 
			+ "2. Login. \n" 
			+ "3. Exit. \n");
			
			System.out.println(ColorsUtility.GREEN + "Enter Choice (1, 2, or 3) :" + ColorsUtility.RESET);
			int choice = scan.nextInt();
			try {
			switch(choice) {
			case 1:
				System.out.println("Create selected!");
				dbc.Create();
				break;
			case 2:
				System.out.println("Login selected!");
				dbc.Login();//
				break;
			case 3:
				System.out.println("Thank you for using dollar bank, goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input. Enter a number from below.");
				startMenu();
				break;
				}
			}
		catch(InputMismatchException e) {
	System.out.println("Invalid Input");
	scan.nextLine();
	startMenu();

		}
	}
}