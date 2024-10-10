package ApplicationSec11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program01 {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-08-24");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-24T01:30:26");
		Instant d06 = Instant.parse("2024-08-27T13:47:00Z");
		/*Instant d07 = Instant.parse("2024-08-27T13:47:00-03:00");*/
		/*Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");*/
		
		LocalDate d08 = LocalDate.parse("27/08/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("27/08/2024 14:14", fmt2);
		
		LocalDate d10 = LocalDate.of(2024, 8, 27);
		LocalDateTime d11 = LocalDateTime.of(2024, 8, 27, 14, 48);
		
		
		
		System.out.println("D01 : " + d01.toString());
		System.out.println("D02 : " + d02.toString());
		System.out.println("D03 : " + d03.toString());
		System.out.println("D04 : " + d04.toString());
		System.out.println("D05 : " + d05.toString());
		System.out.println("D06 : " + d06.toString());
		/*System.out.println("D07 : " + d07.toString());*/
		System.out.println("D08 : " + d08.toString());
		System.out.println("D09 : " + d09.toString());
		System.out.println("D10 : " + d10.toString());
		System.out.println("D11 : " + d11.toString());
	}

}
