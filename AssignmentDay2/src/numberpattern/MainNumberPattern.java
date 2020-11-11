/**
 * 
 */
package numberpattern;

import java.util.Scanner;

/**
 * @author it
 *
 */
public class MainNumberPattern {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberPattern numberPattern = new NumberPattern();
		numberPattern.pattern(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		scan.close();
	}
}
