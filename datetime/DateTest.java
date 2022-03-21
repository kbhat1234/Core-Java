package datetime;

import java.time.LocalDate;

public class DateTest {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate yesterday = date.minusDays(2);
		System.out.println(yesterday);
		LocalDate tomorrow = date.plusDays(2);
		System.out.println(tomorrow);
		
		LocalDate date1 = LocalDate.of(2024, 2, 1);
		System.out.println(date1.isLeapYear());
	}

}
