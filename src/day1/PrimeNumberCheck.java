/* 
    Problem statement  - Find if given Integer is a prime Number or not
	Task: Given an integer element print if given integer is an prime number or not
	Example Input: 17
	Expected Output: 17 is an Prime number
*/

package day1;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int number = sc.nextInt();
		boolean answer = true;
			
		//true - number is prime 
		//false - number is not prime 
		
		if (number==0 || number == 1  ) {
			answer = false;
		}
		
		
		
		for(int i = 2; i < number ; i++) {
			if(number % i == 0) {
				answer = false ; 
				break;
			}
			
		}
		
		
		if (answer == true) {
			System.out.println(number + " is a prime number");	
		}
		else {
			System.out.println(number + " is not a prime number");
		}
		
		sc.close();

	}

}
