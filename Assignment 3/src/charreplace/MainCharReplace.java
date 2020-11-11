package charreplace;

import java.util.Scanner;

public class MainCharReplace {

	public static void main(String[] args) {
		String string;
		Scanner scan = new Scanner(System.in);

		CharReplace charReplace = new CharReplace();

		string = scan.nextLine();

		System.out.println(charReplace.charReplace(string));

		scan.close();
		charReplace = null;

	}

}
