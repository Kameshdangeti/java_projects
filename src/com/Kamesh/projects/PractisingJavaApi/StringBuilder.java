package com.Kamesh.projects.PractisingJavaApi;

public class StringBuilder 
{
	public static void main(String[] args)
	{
		String [] stringarray = {"Car","Bike","Plane","Yacht"};
		String s=" ";
		System.out.println("Before String Object :"+s.hashCode());
		for (String string : stringarray) 
		{
			string=string+" ";
			System.out.println("After String Object :"+string.hashCode());
		}
	}
}
