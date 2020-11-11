package stringreshape;

import java.util.Scanner;

public class MainStringReshape {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String string;
		char additive;
		string = scan.nextLine();
		additive = scan.next().charAt(0);
		
		StringReshape stringReshape = new StringReshape();
		
		System.out.println(stringReshape.stringReshape(string, additive));
		
		
		scan.close();
		
		stringReshape = null;

	}

}
