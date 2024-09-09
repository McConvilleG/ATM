/**
 * 
 */
package ATM;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Gary
 * Class represents program for ATM machine 
 */
public class ATM {
	
	private static double balance = 1000; //initial balance

	/**
	 * @param args
	 * Method will be used for ad hoc testing 
	 */
	public static void main(String[] args) {
		
		//set up scanner to get user input
		Scanner scan = new Scanner(System.in);
		
		//declare & initialise vars
		int userOption;
		userOption = 0;
		
		//switch- to process user option....include do while loop
		do {
			try {
			// separate method call to display the menu
			showMenu();
			
			// capture the user's option- note this is included with a try ..
			// catch and potentially recover if non numeric value is entered
			
			userOption = scan.nextInt();
			
			
			switch (userOption) {
			case 1:
				checkBalance();
				break;
			case 2:
				System.out.println("Enter deposit amount...");
				double depositAmount = scan.nextDouble();
				deposit(depositAmount);
				break;
			case 3:
				System.out.println("Enter withdrawal amount...");
				double withdrawalAmount = scan.nextDouble();
				withdraw(withdrawalAmount);
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Sorry, something went wrong. Enter option 1-4 only please");
			}
			}catch (InputMismatchException inputMismatchException) {
				// input exception - going to recover and try again
				System.out.println("Please enter a number option");
				scan.nextLine(); //this clears out the return character (nextInt takes just the int entered)
			}catch (Exception exception) {
				// general exception - going to recover and try again
				System.out.println("Sorry, had a problem");
				scan.nextLine(); // this clears out the return character (nextInt takes just the int entered)
			}
			
		}while (userOption != 4);
		
		//close resource
		scan.close();
		

	}//end of main
	
	public static void showMenu () {
		
		System.out.println("----------------------------------------------");
		System.out.println("ATM Menu_______________________________");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.println("Please enter number of required action...");
		System.out.println("----------------------------------------------");
		
			
	}//end of showMenu
	
	public static void checkBalance () {
		
		System.out.printf("Your current balance is: £%.2f",balance);
		System.out.println();
		
	}//end of checkBalance
	
	public static void deposit (double depositAmount) {
		
		if (depositAmount % 5 == 0) {
		//update balance 
		balance += depositAmount;
		
		System.out.printf("£%.2f has been deposited into your account. Your new balance is: £%.2f", depositAmount, balance);
		System.out.println();
		} else {
			System.out.println("Sorry, can only make deposit in multiples of 5");
		}
	}//end of deposit 
	
	public static void withdraw (double withdrawalAmount) {
		
		if (withdrawalAmount %10 == 0) {
		//update balance 
		balance -= withdrawalAmount;
		System.out.printf("£%.2f has been withdrawn your account. Your new balance is: £%.2f", withdrawalAmount, balance);
		System.out.println();
		} else {
			System.out.println("Sorry, you can only make a withdrawal in multiples of 10\n");
		}
		
	}// end of withdraw 

}//end of class
