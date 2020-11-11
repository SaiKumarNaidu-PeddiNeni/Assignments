package panagram;

import java.util.Scanner;

public class MainPanagram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String string ;
		
		Panagram panagram = new Panagram();
		
		string = scan.nextLine();
		System.out.println(panagram.checkPanagram(string));
		
		scan.close();
		panagram = null;
	}

}
