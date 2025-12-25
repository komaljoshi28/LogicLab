/* 
    Problem statement  - Find the smallest element in an array
	Task: Given an integer array, find and print the minimum value using a for loop.
	Example Input: {10, -3, 25, 7, 0}
	Expected Output: -3
*/

package day1;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,-3,-25,7,0};
		int min = arr[0];
		for(int i = 1;i<= arr.length-1 ; i++) {
			if (arr[i] < min){
				min = arr[i];
			}
				
		}
		System.out.println(min);

	}

}
