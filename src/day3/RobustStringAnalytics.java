/*
 * Robust String Analytics
Objective: Analyze a line of text.

Requirements
Read a line of text.

Compute:
Number of words (split by whitespace).
Number of sentences (. ! ?).
Longest word.
Count of digits vs letters (use Character.isDigit, Character.isLetter).
Frequency of each vowel (a, e, i, o, u) case-insensitive.


Use arrays to store counts (int[5] for vowels).
Provide a method int[] countVowels(String s).
Use for and do-while (use do-while to force at least one read loop if input is empty).

Sample Input
Hello, world! Java 17 is amazing.

Sample Output (partial)
Words: 5
Sentences: 2
Digits: 2, Letters: 23
Longest word: "amazing"
Vowel freq: a=4 e=1 i=2 o=2 u=0

Constraints

Avoid regex; use manual scanning with loops and conditionals.
Clean punctuation when finding longest word.


 * 
 */

package day3;

import java.util.Scanner;
public class RobustStringAnalytics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence here: ");
		String input = sc.nextLine();
		
		int counter_Sentences = 0;
		int counter_Digits =0;
		int counter_Letters = 0;
		int counter_Words = 0;
		
		
		
		// To get the longest word 
		String[] words = input.split("\\s+"); //Treat multiple spaces as one separator //google 
		String longestWord = "";
		int maxLength = 0;
		
		for(int i = 0;i<words.length;i++) {
			String currentWord = "";
			int letter_Count = 0;
			for(int j =0 ; j<words[i].length();j++) {
				char ch = words[i].charAt(j); //individual characters in words 
				
				if(Character.isLetter(ch)) {
					currentWord = currentWord + ch; //append character to word 
					letter_Count += 1;
				}
			}
			
			// count valid words (must contain at least one letter)
			if (letter_Count > 0) {
				counter_Words++;
			}
		
			if(letter_Count > maxLength) {
				longestWord = currentWord;
				maxLength = letter_Count;
			}
			
		}
		
		

	// to count the number of sentences 
		for(int i = 0;i<input.length();i++) {
			if (input.charAt(i) == '.' || input.charAt(i) == '?' || input.charAt(i) == '!') {
				counter_Sentences += 1;
			}
		}
		
		//count number of digits 
		for(int i = 0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				counter_Digits += 1;
			}
		}
		
		//count number of letter 
		for(int i = 0;i<input.length();i++) {
			if(Character.isLetter(input.charAt(i))) {
				counter_Letters +=1 ;
			}
		}
		
		//for vowel frequency 
		String abc = input.toLowerCase();	
		int[] vowelCounter = new int[5];
		for(int i =0;i<abc.length();i++) {
			char x = abc.charAt(i);
			switch(x) {
				case 'a':
					vowelCounter[0]++;
					break;
				case 'e':
					vowelCounter[1]++;
					break;
				case 'i':
					vowelCounter[2]++;
					break;
				case 'o':
					vowelCounter[3]++;
					break;
				case 'u':
					vowelCounter[4]++;
					break;
				default:		
			}
		}
		//print frequency of vowels 
		char[] vowels = {'a','e','i','o','u'};
		System.out.println("Vowel frequency: ");
		for(int i =0;i<vowelCounter.length;i++) {
			System.out.println(vowels[i] +" = " +vowelCounter[i]);
		}
		
		System.out.println("Words: " +counter_Words);
		System.out.println("Number of sentences: "+counter_Sentences);
		System.out.println("Digits: " + counter_Digits + " Letters: "+ counter_Letters);
		System.out.println("Longest word: " +longestWord);
		
		
		sc.close();
		

	}

}
