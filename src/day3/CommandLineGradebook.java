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
import java.util.Scanner;
public class CommandLineGradebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] names=new String[n];
		int[] grades = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter name of student " + (i+1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter grade of student " + (i+1) + ": ");
            grades[i] = sc.nextInt();
            sc.nextLine();
		}
		int menu_input = 0;
		
		while(true) {
			System.out.println();
			System.out.println("Menu options ");
			System.out.println("1. Print all details ");
			System.out.println("2. Print class topper ");
			System.out.println("3. Print class average");
			System.out.println("4. Search student by name ");
			System.out.println("5. Curve grades by +5 ");
			System.out.println("6. Exit ");
			System.out.println("Enter digit to choose the option");
			menu_input = sc.nextInt();
			
			switch(menu_input) {
				case 1:
					printDetails(names, grades);
					break;
				case 2:
					classTopper(names, grades);
					break;
				case 3:
					classAverage(grades);
					break;
				case 4:
//					searchStudent(names, grades, sc);
					break;
				case 5:
//					curveGrades(grades);
					break;
				case 6:
					System.out.println("Exiting.. ");
					sc.close();
					return;
				default:
					System.out.println("Invalid choice");
					continue;
			}	
		}
	}
	
	public static void printDetails(String[] names, int[] grades) {
		for(int i = 0;i< names.length ;i++) {
			System.out.println("\nName: "+names[i] +" " + "Grades: "+grades[i]);
		}
	}
	
	public static void classTopper(String[] names, int[] grades) {
		String toppername=names[0];
		int maxgrade = grades[0];
		for(int i =1;i<grades.length;i++) {
			if(grades[i]> maxgrade) {
				maxgrade=grades[i];
				toppername = names[i];
			}
		}
		System.out.println("Class topper is: " +toppername + " with grade: "+ maxgrade);
	}
	
	public static void classAverage(int[] grades) {
		int summ = grades[0];
		for(int i =1;i<grades.length;i++) {
			summ += grades[i];
		}
		
		double average = (double)summ / grades.length;
		System.out.printf("Average is: %.2f%n",average);
		
	}
	
}

