package com.Kamesh.projects.practisingExceptionalHandling;

public class NullPointerExceptions5 
{
	public static String s;
	public static void main(String[] args)
	{
		try 
		{
			System.out.println(s.charAt(9));
			System.out.println(s.length());
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("String is not declared.");
	}
}
