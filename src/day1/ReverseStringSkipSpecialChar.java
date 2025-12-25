/* 
    Problem statement  - .Reverse a String but skip non-letter characters
	Task: Reverse only the letters in the string. Non-letters stay in place.
	Example Input: "a,b$c"
	Expected Output: "c,b$a"
*/

//Logic : 
// Use two pointers: one from the start and one from the end of the string
// Move the left pointer forward until it points to a letter
// Move the right pointer backward until it points to a letter
// If both pointers point to letters, swap them and move both pointers
// If a pointer points to a non-letter, move only that pointer
// Continue until both pointers meet or cross
// This reverses only the letters while keeping non-letter characters in the same positions

package day1;
import java.util.Scanner;
public class ReverseStringSkipSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the string: ");
		String inputfromuser = sc.nextLine();
		StringBuilder input = new StringBuilder(inputfromuser);
		int i = 0;
		int j = input.length() - 1;
		
		for(; i< j ;) {
			char left = input.charAt(i);
			char right = input.charAt(j);
			
			if (Character.isLetter(left) && Character.isLetter(right)) {
				
				input.setCharAt(i , right);
				input.setCharAt(j, left);
				i++;
				j--;
			}
			
			else if(Character.isLetter(left) && !Character.isLetter(right)){
				j--;
			}
			else{
				i++;
			}
			
		}
		
		System.out.println(input);
		sc.close();

	}
}
