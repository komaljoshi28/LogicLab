/* 
    Problem statement  - Reverse a String
	Task: Print the reverse of a given string.
	Example Input: "Mumbai"
	Expected Output: "iabmuM" 
*/

package day1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a string:");
		String input = sc.nextLine();
		
//		String reversed = " "; //immutable
		StringBuilder reversed = new StringBuilder(); //mutable
		
		for (int i = input.length() - 1; i >= 0; i--) {
//            reversed = reversed + input.charAt(i);
            reversed.append(input.charAt(i));
            
        }
		
        System.out.println("Reversed string: " + reversed);
        sc.close(); 
//        To release system resources and avoid memory leaks.

	}

}
