package samllestnumber;

import java.util.Arrays;

public class SmallestNumber {
	
	/*
	 * private int dimensions;
	 * 
	 * public int getDimensions() { return dimensions; }
	 * 
	 * public void setDimensions(int dimensions) { this.dimensions = dimensions; }
	 */
	private int[] numbers;
	 
	 
	 public void array(int size)
	 {
	 numbers = new int[size];
	 }
	   public void setNumber(int number, int index)
	   {
		   this.numbers[index] = number;
	   }
	   
	protected int smallNumberFinding()
	{
		
	Arrays.sort(numbers);
	return numbers[0];
	}
}
