ATM Simulation Program
Overview
This Java program simulates basic ATM (Automated Teller Machine) operations. It allows users to perform essential banking functions such as:
  Checking their account balance
  Depositing money
  Withdrawing money
  Exiting the application
  
The program has a simple text-based interface and includes error handling to manage invalid inputs. The initial balance is set to £1000.

Features:
1. Check Balance
The user can check their current balance by selecting the "Check Balance" option from the menu.

2. Deposit Money
The user can deposit money into their account. However, deposits are restricted to multiples of £5 to simulate real-world limitations.

3. Withdraw Money
The user can withdraw money from their account, but withdrawals are limited to multiples of £10 to ensure compatibility with typical ATM withdrawal increments.

4. Exit
The user can exit the program by selecting the "Exit" option.

Classes and Methods:

ATM Class
  This class represents the entire program. It contains all the methods to interact with the user and perform operations.

Fields:
  private static double balance: The account balance, initialized to £1000.

Methods:
  main(String[] args): The entry point of the program. It handles the menu navigation and user input.
  
  showMenu(): Displays the ATM menu options.
  
  checkBalance(): Displays the current balance.
  
  deposit(double depositAmount): Accepts a deposit amount and updates the balance if the amount is a multiple of 5.
  
  withdraw(double withdrawalAmount): Accepts a withdrawal amount and updates the balance if the amount is a multiple of 10.

Future Enhancements

  Multiple Account Support: Allow users to manage multiple accounts by providing login functionality.
  
  Transaction History: Implement a feature to track and display the user's transaction history.
  
  Balance Validation: Add validation to ensure users cannot withdraw more than their current balance.
  
  User Authentication: Add security measures such as PIN verification.

This program provides a simple and interactive simulation of ATM operations, making it a great learning project for basic input handling, control flow, and exception management in Java.










