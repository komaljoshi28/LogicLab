/* 
    Problem statement  - Reverse Words in a Sentence

Topic: Strings
Task: Given a sentence, reverse each word but keep the word order same.
Example Input: "Java is fun"
Expected Output: "avaJ si nuf"
----

*/

package day2;

import java.util.Scanner;


public class ReverseWordsInSentemce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input = sc.nextLine();
		
		String[] words = input.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			StringBuilder reversed = new StringBuilder(words[i]);
			System.out.print(reversed.reverse() + " ");
		}
		
		sc.close();
		

	}

}
