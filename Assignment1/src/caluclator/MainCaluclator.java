package caluclator;

import java.util.*;

public class MainCaluclator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		CaluclatorMethods calculator = new CaluclatorMethods();
		calculator.number1 = scanner.nextFloat();
		calculator.number2 = scanner.nextFloat();

		System.out.println("added value " + calculator.Addition(calculator.number1, calculator.number2));
		System.out.println("subtracted value " + calculator.Substraction(calculator.number1, calculator.number2));
		System.out.println("multiplied value " + calculator.Multiplication(calculator.number1, calculator.number2));
		System.out.print("divided value " + calculator.Division(calculator.number1, calculator.number2));

		calculator = null;
		scanner.close();

	}

}
