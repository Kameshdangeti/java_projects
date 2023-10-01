package com.Kamesh.projects.PractisingJavaApi;

public class StringBuilder2 
{
	public static void main(String[] args) 
	{
		String [] stringarray = {"Apple","Xiaomi","Huwaei","Oneplus"};
		String s=" ";
		System.out.println("Before String Object :"+s.hashCode());
		for (String string : stringarray) 
		{
			string=string+" ";
			System.out.println("After the string object :"+string.hashCode());
		}
	}
}
