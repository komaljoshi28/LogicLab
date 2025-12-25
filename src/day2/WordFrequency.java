/* 
    Problem statement  - Count Frequency of Each Word

Topic: Strings & Arrays
Task: Given a sentence, count how many times each word appears.
Example Input: "Java is fun and Java is powerful"
Expected Output:
Java: 2
is: 2
fun: 1
and: 1
powerful: 1
----
*/
package day2;

import java.util.Scanner;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input = sc.nextLine();
		
		String[] words = input.split(" ");
		boolean[] visited = new boolean[words.length];
		
		for (int i = 0; i < words.length; i++) {
			if (visited[i]) {
				continue;
			}
			
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					visited[j] = true;
				}
			}
			
			System.out.println(words[i] + ": " + count);
		}
		
		sc.close();

	}

}
