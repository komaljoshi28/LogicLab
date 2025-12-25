/* 
    Problem statement  - Find Second Largest Number

Topic: Arrays
Task: Given an array, find the second largest element without sorting.
Example Input: {10, 25, 7, 30, 15}
Expected Output: 25

*/

package day2;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {10, 25, 77, 300, 15};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("Second Largest = " + secondLargest);
		

	}

}
