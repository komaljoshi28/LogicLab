/*
 * CLI Phonebook with Partial Match & Commands
Objective: Manage contacts with name and phone.
Requirements

Store up to 100 contacts in parallel arrays String[] names, String[] phones.
Commands:

ADD name phone
DEL name
FIND substring (case-insensitive)
LIST
EXIT


Parse commands with String.split(" "), careful about spaces in names (handle quoted names, bonus).
Use for loops for search; continue for empty lines.
Methods: add, delete, find, list.

Sample Interaction (partial)
ADD Alice 9876543210
ADD Bob 9123456789
FIND li
LIST
EXIT

Sample Output
Found: Alice(9876543210)
Alice(9876543210), Bob(9123456789)
Goodbye.

Constraints

Validate phone: exactly 10 digits (Character.isDigit).
Use comments to explain command parsing.
 */
package day3;

public class CLIPhonebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
