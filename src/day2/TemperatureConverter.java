/* 
    Problem statement  - Temperature Converter

Topic: Variables & Operators
Task: Convert temperature from Celsius to Fahrenheit and vice versa. Ask the user which conversion they want.
Example Input:
Choice: CtoF
Value: 37

Expected Output:
Fahrenheit = 98.6

----

*/
package day2;
import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter conversion type (CtoF / FtoC): ");
		String choice = sc.nextLine();
		
		System.out.println("Enter temperature value: ");
		double value = sc.nextDouble();
		
		if (choice.equalsIgnoreCase("CtoF")) {
			double fahrenheit = (value * 9 / 5) + 32;
			System.out.println("Fahrenheit = " + fahrenheit);
		}
		else if (choice.equalsIgnoreCase("FtoC")) {
			double celsius = (value - 32) * 5 / 9;
			System.out.println("Celsius = " + celsius);
		}
		else {
			System.out.println("Invalid choice");
		}
		
		sc.close();

	}

}
