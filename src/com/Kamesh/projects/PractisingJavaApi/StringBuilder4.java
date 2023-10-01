package com.Kamesh.projects.PractisingJavaApi;

public class StringBuilder4 
{
	public static void main(String[] args) 
	{
		String[] sa = {"A","B","c"};
		String s=" ";
		System.out.println("Before the String Object :"+s.hashCode());
		for (String string : sa) 
		{
			string =string+" ";
			System.out.println("After the String Object :"+string.hashCode());
		}
	}
}
