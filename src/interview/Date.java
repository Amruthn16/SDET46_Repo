package interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

	public static void main(String[] args) throws ParseException {

		String dateString = "09/05/2019";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/m/yy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(dateString));
		//calendar.add(Calendar.DAY_OF_MONTH, 0);
		String date = sdf.format(cal.getTime());
		String trr = date.replace('/', '-');
		System.out.println(trr);
	}
}
