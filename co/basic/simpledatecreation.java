package in.co.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledatecreation {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String str = format.format(d);
		System.out.println("date:" + str);
		String str1 = "01/02/2006";
		Date d1 = format.parse(str);
		System.out.println(d1);
		
	}
}
