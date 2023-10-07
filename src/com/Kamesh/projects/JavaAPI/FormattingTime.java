//Below we can see the code for creating and manipulating the calender data by using classes from,
//java.time.format.TimeFormatter.

package com.Kamesh.projects.JavaAPI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingTime {
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(17, 40);

		System.out.println(time);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH-mm");

		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("'phone call at' h-mm a");

		System.out.println(time.format(formatter));
		System.out.println(time.format(formatter2));
		System.out.println(time.format(formatter3));

	}
}
