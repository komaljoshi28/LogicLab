/* 
    Problem statement  - Factorial Using Recursion

Topic: Methods
Task: Write a recursive method factorial(int n) and print factorial of a given number.
Example Input: 5
Expected Output: 120
----
*/

package day2;

import java.util.Scanner;

public class Factorial_Recursion {
	
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		System.out.println("Factorial = " + factorial(n));
		sc.close();

	}

}
