//Below we can see the code for creating and manipulating the calender data by using classes from,
//java.time.period.

package Working_With_Selected_Classes_From_Java_Api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Time_period
{
	public static void main(String[] args)
	{
		System.out.println(Period.of(1, 2, 3));
		
		System.out.println(Period.of(0, 33, 65));
		
		LocalDate date=LocalDate.of(2023, Month.SEPTEMBER, 16);
		
		LocalTime time=LocalTime.of(11, 35);
		
		LocalDateTime dateTime=LocalDateTime.of(date, time);
		
		Period sevenDays=Period.ofDays(7);
		
		System.out.println(date.plus(sevenDays));
		System.out.println(date);
		System.out.println(dateTime.plus(sevenDays));
		System.out.println(time);
		
	}
}
