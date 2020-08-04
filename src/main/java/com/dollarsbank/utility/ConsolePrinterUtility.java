package com.dollarsbank.utility;

/**
 * A class for holding all print console output methods 
 * @author chris
 *
 */
public class ConsolePrinterUtility {

	//Menu menu = new Menu();
	
	//all the banners for each menu view and multicolor settings
	
	 public static void printWelcome() {
	 System.out.println(ColorsUtility.BLUE +
				"+------------------------+\r\n" + 
				"|DOLLARBANK welcomes you!|\r\n" + 
				"+------------------------+" + ColorsUtility.RESET);
      //menu.StartMenu();
	 }
	 
	 public static void printNewAccWelcome() {
		 System.out.println(ColorsUtility.BLUE + 
	    "+--------------------------------+\r\n" + 
		"| Enter Details for New Account! |\r\n" + 
		"+--------------------------------+" 
		+ ColorsUtility.RESET);

	 }
	 public static void promptName() {
		System.out.println("Customer Name: ");
		//String cust_name = scan.nextLine();
	 }
	 public static void promptAddress() {
		System.out.println("Customer Address: ");
		//String addr = scan.nextLine();
	 }
	 
	 public static void promptNumber() {	
		System.out.println("Customer Contact Number: ");
		//String number = scan.nextLine();
	 }
	 
	 public static void promptUserId() {
		System.out.println("User Id: ");
		//String userid = scan.nextLine();
	 }
	 public static void promptPassword() {
		System.out.println("Password: 8 characters with lower, upper, & special characters");
		//String pass = scan.nextLine();
	 }
	 public static void promptAmount() {
		System.out.println("Initial Deposit Amount");
		//double balance = Double.parseDouble(scan.nextLine());
		//scan.close();
	 }
	 
	public static String choicePrompt = ColorsUtility.GREEN + "Enter Choice (1, 2, or 3) :" + ColorsUtility.RESET;
	
	 public static void promptLogin() {
	System.out.println(ColorsUtility.BLUE +
			" +---------------------+\r\n" + 
			" | Enter Login Details |\r\n" + 
			" +---------------------+" + ColorsUtility.RESET);
	 }
	 public static void promptLoginSuccess() {
		 System.out.println("Login successful");
	 }
	 
	 public static void promptError() {
			System.out.println(ColorsUtility.RED + "Invalid credentials, Try again!" + ColorsUtility.RESET);
	 }
}