package ApplicationSec11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program03 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2024-08-27");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-27T01:30:26");
		Instant d06 = Instant.parse("2024-08-27T18:42:00Z");
				
		/*LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());*/
				
	}

}
