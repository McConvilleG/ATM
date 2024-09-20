# ATM Programme

ATM Simulation Program. This Java program simulates basic ATM (Automated Teller Machine) operations. It allows users to perform essential banking functions such as: Checking their account balance, Depositing money, Withdrawing money & Exiting the application

The program has a simple text-based interface and includes error handling to manage invalid inputs. The initial balance is set to £1000.

## Features

- Check Balance: The user can check their current balance by selecting the "Check Balance" option from the menu.
- Deposit Money: The user can deposit money into their account. However, deposits are restricted to multiples of £5 to simulate real-world limitations.
- Withdraw Money: The user can withdraw money from their account, but withdrawals are limited to multiples of £10 to ensure compatibility with typical ATM withdrawal increments.
- Exit:The user can exit the program by selecting the "Exit" option.

## Project Structure
ATMProgram/ ├── src/ │ ├── ATM.java # Entry point for the application 


## Requirements

- Java Development Kit (JDK) 8 or higher

## Installation

1. Clone the repository or download the source code.
2. Ensure you have the JDK installed and configured in your system's `PATH`.

OR

Open on IDE, such as Eclipse 

## Usage

1. Navigate to the project directory in the terminal: cd path/to/ATMProgram
2. Compile the source files using command: javac src/*.java -d out/
3. Run the application: java -cp out Main
4. Follow on screen instructions to operate application

OR

2.Run via IDE

## Contributions 

Contributions welcome. If you'd like to contribute to the project, use following steps: 

1. Fork the repo
2. Create new branch for your feature or ammendment: git checkout -b feature/your-feature-name
3. Make changes and commit: git commit -m "Add some feature"
4. Push to branch: git push origin feature/your-feature-name
5. Create pull request describing your changes 

	Guidelines: Make sure code is well documented,
		          Keep changes focused on single feature/bug fix, 
		          Ensure code compiles and runs correctly prior to submitting  



