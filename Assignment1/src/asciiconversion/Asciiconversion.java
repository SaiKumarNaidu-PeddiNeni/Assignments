package asciiconversion;

import java.util.Scanner;

public class Asciiconversion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number1= scan.nextInt();
		
		char ascii = (char)number1;
		
		System.out.println(ascii);
		
		scan.close();

	}

}
