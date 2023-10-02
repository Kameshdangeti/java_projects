package com.Kamesh.projects.PractisingJavaApi;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormattingDate 
{
	public static void main(String[] args)
	{
		 LocalDate date =LocalDate.of(2023, Month.OCTOBER, 02);
		   
		   System.out.println(date);
		   
		  DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
		  
	      DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("yyyy-MM-dd E D");
	      
	      DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("yy-MMM-dd EEEE d");
	      
	      System.out.println(date.format(formatter));
	      System.out.println(date.format(formatter2));
	      System.out.println(date.format(formatter3));
	}
}
