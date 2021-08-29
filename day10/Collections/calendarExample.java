package day10.Collections;

import java.util.Calendar;

public class calendarExample {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("The current date is:" + calendar.getTime());
		calendar.add(Calendar.DATE, -15);
		System.out.println("15 days too go:" + calendar.getTime());
		calendar.add(Calendar.MONTH, 4);
		System.out.println("4 Months Later:" + calendar.getTime());
		calendar.add(Calendar.YEAR, 2);
		System.out.println("2 Years Later:" + calendar.getTime());
	}

}
