package substring;

import java.util.Scanner;

public class MainSubSring {

	public static void main(String[] args) {
		int startIndex;
		int endIndex;
		String string;
		
		Scanner scan = new Scanner(System.in);
		string = scan.nextLine();
		startIndex = scan.nextInt();
		endIndex = scan.nextInt();
		//scan.nextLine();
		
		
		SubString subString = new SubString();
		
		System.out.println(subString.subString(string,startIndex,endIndex));
		
		subString = null;
		scan.close();
		

	}

}
