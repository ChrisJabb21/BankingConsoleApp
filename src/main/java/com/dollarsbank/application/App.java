package com.dollarsbank.application;

import com.dollarsbank.utility.ConsolePrinterUtility;

public class App 
{
    public static void main( String[] args )
    {     
		/*
		 * try {
		 */Menu menu = new Menu();
        ConsolePrinterUtility.printWelcome();
        menu.StartMenu();
    	/*} catch (Exception e) {
    		e.printStackTrace();
    	}*/
    }
}    
    /* Prompt a menu for user login system
     * Ask user to login
     * 
     * if user info correct
     * 	sign
     * else if incorrect input
     *  say invalid and try again.
     * 
     * */
    
    /*
     * Let user
     * make deposit
     * withdrawal
     * do a funds transfer
     * show 5 recent transaction history by time and date
     * Display customer information
     * 
     * sign out (should go back to login menu) or say good bye/exit program
     * */
