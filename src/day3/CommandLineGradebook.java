/* 
Command-Line Gradebook
Objective: Maintain grades for students using arrays and methods.
Requirements

Read n (number of students), then read n names and n integer grades (0–100).
Store names in String[], grades in int[].
Provide menu:

Print all
Print topper
Class average
Search by name (case-insensitive)
Curve grades by +5 (cap at 100)
Exit


Implement each option in a separate method.
Use while(true) loop with break to exit; use continue on invalid menu choice.
Use String.equalsIgnoreCase, Character.toUpperCase where needed.

Sample Input
3
Alice
90
bob
82
Charlie
76
1
2
3
4
Bob
6

Sample Output (partial)
All: Alice(90), bob(82), Charlie(76)
Topper: Alice(90)
Average: 82.67
Found: bob(82)
Exiting...

Constraints

Use double for average; format to 2 decimals.
Validate input bounds; handle empty names.
Add Javadoc for each method.

*/ 
package day3;

public class CommandLineGradebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
