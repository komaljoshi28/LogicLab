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
	
	public static boolean isPalindrome(String s){
		s=s.toLowerCase();
		StringBuilder reversed = new StringBuilder();
		
		for (int i = s.length() - 1; i >= 0; i--) {
          reversed.append(s.charAt(i));
		}
		
		if(s.equals(reversed.toString())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word: ");
		String input = sc.nextLine();
		if (isPalindrome(input)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		sc.close();
	}

}
