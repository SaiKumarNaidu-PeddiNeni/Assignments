package localtd;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDate {

	public static void main(String[] args) {
		System.out.println(LocalDate.now()); 
		System.out.println(LocalTime.now());
	    System.out.println(LocalDateTime.now());
	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd , HH:mm:ss ");
	    System.out.println(formatter.format(LocalDateTime.now()));
	}

}
