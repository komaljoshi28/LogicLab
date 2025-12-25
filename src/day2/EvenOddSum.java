/* 
    Problem statement  - Sum of Even and Odd Numbers Separately

Topic: Loops & Control Flow
Task: Read n numbers and print sum of even numbers and sum of odd numbers separately.
Example Input: 5 numbers: 2 3 4 5 6
Expected Output:
Sum of Even = 12
Sum of Odd = 8
----
*/

package day2;

import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements:");
		int n = sc.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;
		
		System.out.println("Enter numbers:");
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				evenSum += num;
			}
			else {
				oddSum += num;
			}
		}
		
		System.out.println("Sum of Even = " + evenSum);
		System.out.println("Sum of Odd = " + oddSum);
		
		sc.close();

	}

}
