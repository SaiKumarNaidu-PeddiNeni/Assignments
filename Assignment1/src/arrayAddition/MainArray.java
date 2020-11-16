package arrayAddition;

import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayAdditionBehaviour arrayAdditionBehaviour = new ArrayAdditionBehaviour();
		arrayAdditionBehaviour.size = scanner.nextInt();
		Integer[] array = new Integer[arrayAdditionBehaviour.size];
		
		for(int i=0; i<arrayAdditionBehaviour.size;i++)
		{
			array[i]= scanner.nextInt();
		}
		
		System.out.println(arrayAdditionBehaviour.arrayAddition(array));
		
		arrayAdditionBehaviour = null;
		
		scanner.close();

	}

}
