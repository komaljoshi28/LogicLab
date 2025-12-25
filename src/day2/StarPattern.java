/* 
    Problem statement  - Print Pattern (Loops)

Topic: Loops
Task: Print the following pattern for n=4:



*
* *
* * *
* * * *

*/

package day2;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		for(int i = 0 ; i < x;i++) {
			for(int j = 0; j<i+1 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
