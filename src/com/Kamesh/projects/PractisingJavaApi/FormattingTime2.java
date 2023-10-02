package com.Kamesh.projects.PractisingJavaApi;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingTime2 
{
	public static void main(String[] args) 
	{
        LocalTime time=LocalTime.of(14, 47);
		
		System.out.println(time);
		
		DateTimeFormatter formatter1 =DateTimeFormatter.ofPattern("hh:mm:ss");
		DateTimeFormatter formatter2 =DateTimeFormatter.ofPattern("hh:mm");
		DateTimeFormatter formatter3 =DateTimeFormatter.ofPattern("'Phone call on' h-mm a");
		
		System.out.println(time.format(formatter1));
		System.out.println(time.format(formatter2));
		System.out.println(time.format(formatter3));
	}
}
