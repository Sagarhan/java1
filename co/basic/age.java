package in.co.basic;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Locale;

public class age {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		LocalDate birthDate = LocalDate.of(2004, 02, 01);
	int years =Period.between(birthDate, today).getMonths();
		System.out.println(today);
		System.out.println(birthDate);
		System.out.println(years);
	}

}
