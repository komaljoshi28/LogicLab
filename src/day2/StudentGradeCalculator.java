/* 
    Problem statement  -  Student Grade Calculator

Topic: Control Flow
Task: Read marks of 5 subjects, calculate percentage, and assign grade:

A: ≥90
B: ≥75
C: ≥60
D: ≥40
F: <40
Example Input: 80 90 85 70 75
Expected Output:
Percentage = 80.0
Grade = B
----
*/
package day2;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		
		System.out.println("Enter marks of 5 subjects:");
		for (int i = 1; i <= 5; i++) {
			total += sc.nextInt();
		}
		
		double percentage = total / 5.0;
		System.out.println("Percentage = " + percentage);
		
		if (percentage >= 90) {
			System.out.println("Grade = A");
		}
		else if (percentage >= 75) {
			System.out.println("Grade = B");
		}
		else if (percentage >= 60) {
			System.out.println("Grade = C");
		}
		else if (percentage >= 40) {
			System.out.println("Grade = D");
		}
		else {
			System.out.println("Grade = F");
		}
		
		sc.close();

	}

}
