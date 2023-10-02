package com.Kamesh.projects.PractisingJavaApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class CreatingTimePeriod2 
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
