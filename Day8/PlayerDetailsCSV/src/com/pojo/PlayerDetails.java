package com.pojo;

import java.io.FileOutputStream;
import java.io.IOException;

public class PlayerDetails {

	public static void OutputStream(String name, String team, int matchesPlayed) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\HCL\\Mode1Training\\Java\\Day8\\player.csv");
		fileOutputStream.write(name.getBytes());
		fileOutputStream.write(',');
		fileOutputStream.write(team.getBytes());
		fileOutputStream.write(',');
		fileOutputStream.write(String.valueOf(matchesPlayed).getBytes());

		fileOutputStream.close();

	}

}
