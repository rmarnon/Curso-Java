package test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Teste {

	public static void main(String[] args) {

		GregorianCalendar cal = new GregorianCalendar(1982, Calendar.APRIL, 29);
		GregorianCalendar cal1 = new GregorianCalendar(2019, Calendar.SEPTEMBER, 19);
		
		cal1.add(Calendar.DAY_OF_MONTH, 100);
		Date d = cal1.getTime();
		System.out.println(d);
		int week = cal1.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		cal.add(Calendar.DAY_OF_WEEK, 10000);
		d = cal.getTime();
		System.out.println(d);
		
	
	}
}
