package ControlFlowStatement;

import java.util.Scanner;

public class ATMMachineSimulator {
	
	public static void main(String[] args) {
		/*--- ATM Machine Simulator ---
		
		 1. User login with PIN
         2. Balance inquiry
         3. Withdraw and deposit with conditions (e.g., max withdrawal limit)
         4. Exit option
		 */
		
		Scanner sc = new Scanner(System.in);
		int pin = 2424;
		int balance = 0;
		boolean running = true;
		System.out.println("--- Welcome to ATM! ---");
		System.out.println("Please provide your 4 digit PIN:");
		int enteredPin = sc.nextInt();
		if(pin != enteredPin) {
			System.out.println("Invalid PIN. Please try again");
			return;
		}
		
		while(running) {
			System.out.println("--------------------");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("--------------------");
			System.out.print("Select a option: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Current Balance: " + balance);
				break;
				
			case 2:
				System.out.println("Deposit Amount:");
				int amount = sc.nextInt();
				if(amount > 0) {
					balance += amount;
					System.out.println("Deposited Successfully!");
				} else {
					System.out.println("Invalid deposit amount");
				}
				break;
				
			case 3:
				System.out.println("Withdraw Amount:");
				int withdraw = sc.nextInt();
				if(withdraw > 0 && withdraw <= balance) {
					balance -= withdraw;
					System.out.println("Withdrawn Successfully!");
				} else {
					System.out.println("Insufficient balance or invalid amount.");
				}
				break;
				
			case 4:
				System.out.println("Thank you for using the ATM.");
				running = false;
				break;
				
			default:
				System.out.println("Invalid option. Try again.");
			}
		}
		sc.close();
	}

}
