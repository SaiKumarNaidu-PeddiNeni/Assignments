/**
 * 
 */
package interfaceexample;

/**
 * @Sai Kumar Nov 9, 2020
 * 
 */
public class MyCalculator {

	public int divisor_sum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
