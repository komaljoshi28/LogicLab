/*
 * Robust Password Validator
Objective: Validate passwords with multiple rules.
Requirements

Read a password string.
Rules:

Length 8–20
At least one uppercase, lowercase, digit, special (!@#$%^&*).
No spaces.
Must not contain the username (ask for username separately).


Use wrappers (Character.isUpperCase, etc.).
Methods: boolean isValid(String pwd, String user), String feedback(String pwd, String user).
Use for loop scanning; continue on non-contributing characters.

Sample Input
username: sarthak
password: S@rthak123

Sample Output
Invalid: contains username sequence "arthak".
Feedback:
- Avoid using parts of your name.
- Add more special characters.

Constraints

Provide clear comments and structured code.
Use String.contains, case-insensitive check via .toLowerCase().
 */

package day3;

public class RobustPasswordValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
