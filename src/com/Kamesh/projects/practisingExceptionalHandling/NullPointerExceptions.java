package com.Kamesh.projects.practisingExceptionalHandling;

public class NullPointerExceptions
{
	public static String s;
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(s.charAt(3));
			System.out.println(s.length());
		} 
		catch (Exception e)
		{
			System.out.println("Exception handled");
		}
		System.out.println("String value is not declared");
	}
}
