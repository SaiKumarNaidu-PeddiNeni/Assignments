/**
 * 
 */
package stringmiddlecharacter;

import java.util.Scanner;

/**
 * @SaiKumar
 *
 */
public class MainStringMiddle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		StringMiddleCharcter stringMiddleCharcter = new StringMiddleCharcter();
		stringMiddleCharcter.setString(scanner.nextLine());
		System.out.println(stringMiddleCharcter.middleCharcter());

		stringMiddleCharcter = null;
		scanner.close();

	}

}
