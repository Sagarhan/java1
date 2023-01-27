package in.co.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testdatefaction {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String str = format.format(d);
		System.out.println(str);

		String str1 = "2/01/2004";
		Date d1 = format.parse(str1);
		System.out.println(d1);
		

	}

}
