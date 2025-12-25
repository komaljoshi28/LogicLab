/*
 * Compressed Run-Length Encoding (RLE) with Options
Objective: Implement RLE for strings with CLI options.
Requirements

Menu:

1) Compress
2) Decompress
3) Exit


Compress rule: "aaabbc" → "a3b2c1".
Decompress rule: "a3b2c1" → "aaabbc".
Validate input (letters only in compress; correct format in decompress).
Use StringBuilder and wrapper class parsing (Character.isDigit, Integer.parseInt for counts).
Use for loop with continue to skip invalid chars.

Sample Input/Output
1
aaabbc
a3b2c1

Constraints

Disallow counts > 9 unless you implement multi-digit parsing (bonus).
Separate methods: compress, decompress, isValidEncoded.
 */

package day3;

public class CompressedRLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
