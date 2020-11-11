package vowelscount;

import java.util.Scanner;

public class MainVowelsCount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		VowelsCount vowelsCount = new VowelsCount();

		vowelsCount.setString(scanner.nextLine());

		System.out.println(vowelsCount.vowelsCount());

		scanner.close();
		vowelsCount = null;

	}

}
