package countingVowels;
import java.util.Scanner;

public class MainSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SwitchBehaviour switchBehaviour = new SwitchBehaviour();
		
		switchBehaviour.string = scanner.nextLine();
		System.out.print(switchBehaviour.findVowels(switchBehaviour.string));
		
		switchBehaviour =null;
		
		scanner.close();
	

	}

}
