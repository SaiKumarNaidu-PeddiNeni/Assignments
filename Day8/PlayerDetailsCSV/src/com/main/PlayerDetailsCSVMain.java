/*Write a java program to record the player details into the file. Get the player details name, teamName and number of matches played from the user and write those information in a comma seperated format (CSV).
Below is the format of the output file.
<name>,<teamName>,<numberOfMatches>
eg: Virat Kohli,Royal Challengers Bangalore,16*/

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.io.IOException;
import java.util.Scanner;

import com.pojo.PlayerDetails;

public class PlayerDetailsCSVMain {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name of the player");
		String name = scanner.nextLine();

		System.out.println("Enter the team name ");
		String team = scanner.nextLine();

		System.out.println("Enter number of matches played ");
		int matchesPlayed = scanner.nextInt();

		PlayerDetails.OutputStream(name, team, matchesPlayed);
		scanner.close();

	}

}
