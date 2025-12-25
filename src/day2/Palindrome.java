/* 
    Problem statement  - Palindrome Checker

Topic: Strings & Methods
Task: Write a method isPalindrome(String s) that checks if a string is a palindrome. Ignore case.
Example Input: "Madam"
Expected Output: Palindrome 
----
*/

package day2;

import java.util.Scanner;


public class Palindrome {
	
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int i = 0;
		int j = s.length() - 1;
		
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = sc.nextLine();
		
		if (isPalindrome(input)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		sc.close();

	}

}
