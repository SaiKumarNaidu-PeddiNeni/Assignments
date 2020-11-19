package dateandtime;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;


public class DateandTime {

	public static void main(String[] args) throws ParseException {
		/*
		 * System.out.println(LocalDate.now()); System.out.println(LocalTime.now());
		 * System.out.println(LocalDateTime.now());
		 */
		Scanner scan = new Scanner(System.in);
		String  dateTimeString = scan.nextLine();
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateTimeString);
		 String newstr = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
	       System.out.println("\n"+newstr+"\n");
		
		//System.out.println(formatter.format(LocalDateTime.MIN));
		
		scan.close();

	}

}
