/**
 * 
 */
package numberpattern;

/**
 * @SaiKumar
 *
 */
public class NumberPattern {
			
	public void pattern(int ...numbers)
	{
		String string = Integer.toString(numbers[0]);
		int sum=numbers[0];
		for (int i = 0; i < numbers.length -1; i++) {
			string = string + "+" +Integer.toString(numbers[i+1]);
			sum += numbers[i+1];
			if(i==2)
			{
				continue;
			}
			System.out.println(string + " = "+ sum);
			
		}
	}
	
}
