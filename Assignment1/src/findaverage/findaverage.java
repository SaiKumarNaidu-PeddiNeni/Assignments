package findaverage;

import java.util.Scanner;

public class findaverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		float avg =(num1+num2+num3)/3;
		
		System.out.println("average of given numbers" + avg);
		
		scan.close();
		
		
		
		

	}

}
