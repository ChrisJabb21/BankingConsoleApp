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
        menu.startMenu();
    	/*} catch (Exception e) {
    		e.printStackTrace();
    	}*/
    }
}    
    /* 
     * if user info correct
     * 	sign
     * else if incorrect input
     *  say invalid and try again.
     *  */
    
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
