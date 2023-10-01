package com.Kamesh.projects.PractisingJavaApi;

public class StringBuilder5 
{
	public static void main(String[] args) 
	{
		String [] s1= {"Dell","Hp","Asus"};
		String s2 =" ";
		System.out.println("Before the String Object :"+s2.hashCode());
		for (String string : s1) 
		{
			string = string+" ";
			System.out.println("After the String Object :"+string.hashCode());
		}
	}
}
