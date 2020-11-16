package Swap;

public class Swap {
	private int number1;
	private int number2;

	public Swap(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public void swapping() {
		number2 = (number1 + number2) - (number1 = number2);
		System.out.println("Afer Swap: number1 = " + number1 + "n umber2 = " + number2);

	}
}
