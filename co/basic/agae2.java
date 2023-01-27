package in.co.basic;

import java.time.LocalDate;
import java.time.Period;

public class agae2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate barthday = LocalDate.of(2004, 01, 02);
        
		Period years = Period.between(barthday, today);
		System.out.println(today);
		System.out.println(barthday);
		System.out.println(years);      
	}

}
