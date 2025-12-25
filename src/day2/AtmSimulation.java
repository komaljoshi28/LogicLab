/* 
    Problem statement  - Simple ATM Simulation

Topic: Control Flow & Loops
Task: Simulate an ATM with options:

Check Balance
Deposit
Withdraw
Exit
Start with balance = 1000.
Example Interaction:
Choice: 2
Enter amount: 500
New Balance: 1500
----
*/


package day2;

import java.util.Scanner;

public class AtmSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int balance = 1000;
		int choice;
		char continueoption = 'y';
		
		while(continueoption == 'y') {
			
			System.out.println("\n1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			
			System.out.println("Enter choice:");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Balance = " + balance);
				break;
				
			case 2:
				System.out.println("Enter amount to deposit:");
				int deposit = sc.nextInt();
				balance += deposit;
				System.out.println("Remaining Balance = " + balance);
				break;
				
			case 3:
				System.out.println("Enter amount:");
				int withdraw = sc.nextInt();
				if (withdraw <= balance) {
					balance -= withdraw;
					System.out.println("New Balance = " + balance);
				}
				else {
					System.out.println("Insufficient balance");
				}
				break;
				
			case 4:
				System.out.println("Thank you!");
				break;
				
			default:
				System.out.println("Invalid choice");
			}
			
			System.out.println("Do you want to continue (y/n)");
			continueoption = sc.next().charAt(0);
			
		} 
		
		sc.close();

	}

}
