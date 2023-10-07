//Below we can see the code for creating and manipulating the calender data by using classes from,
//java.time.LocalDate
// java.time.LocalDateTime
// java.time.LocalTime

package com.Kamesh.projects.JavaAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CreatingLocalDateLocalTimeLocalDateTime {
	public static void main(String[] args) {
		// creating local time,local date,local Datetime classes by using
		// now(),of(),parse().

		LocalDate nowDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);

		System.out.println("It is :" + nowDateTime);

		LocalDateTime nowDateTime2 = LocalDateTime.now();

		System.out.println("It is :" + nowDateTime2);

		LocalDate preperationDay1 = LocalDate.of(2023, 9, 16);
		LocalDate preperationDay2 = LocalDate.parse("2023-09-16");

		System.out.println("Preparation day :" + preperationDay1);
		System.out.println("Preparation day :" + preperationDay2);

		LocalTime classBegins = LocalTime.of(9, 0);
		LocalTime classEnds = LocalTime.parse("11:00");

		System.out.println("class Begins at:" + classBegins + "and ends at :" + classEnds);
	}

}
