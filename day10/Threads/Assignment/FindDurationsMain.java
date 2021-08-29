package day10.Threads.Assignment;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To find Difference between two dates
 * 
 * Day:5 Assignment
 * 
 * @author Mnai
 * 
 */
public class FindDurationsMain {
	static void Difference(String start_date, String end_date) {
		SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy");
		try {
			Date date1 = obj.parse(start_date);
			Date date2 = obj.parse(end_date); // converts string to date
			long time_difference = date2.getTime() - date1.getTime();
			long days = (time_difference / 86400000); // calculating for days
			System.out.println("Differnce between Days is:" + days);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
