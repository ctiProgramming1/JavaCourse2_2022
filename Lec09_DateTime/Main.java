package Lec09_DateTime;

/*
 * source: https://www.w3schools.com/java/java_date.asp
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		// Date
		LocalDate d1 = LocalDate.of(2000, 1, 1);
		LocalDate today = LocalDate.now();

		System.out.println(today);

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("E, dd MMMM yyyy");

		System.out.println("Date: " + today.format(formatter1));

		// Time
		LocalDateTime t1 = LocalDateTime.of(2020, 5, 15, 10, 50);
		LocalDateTime now = LocalDateTime.now();

		System.out.println(t1);

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a");

		System.out.println("Date/Time: " + now.format(formatter2));

		// Time between two dates
		System.out.println("\n \n" + ChronoUnit.YEARS.between(d1, today));
		System.out.println("\n \n" + ChronoUnit.MONTHS.between(d1, today));
		System.out.println("\n \n" + ChronoUnit.DAYS.between(d1, today));

	}

}
