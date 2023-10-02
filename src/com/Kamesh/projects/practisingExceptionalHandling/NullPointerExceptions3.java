package com.Kamesh.projects.PractisingExceptionalHandling;

public class NullPointerExceptions3 
{
    public static String s;
    public static void main(String[] args) 
    {
    	try
    	{
		   System.out.println(s.charAt(3));
		   System.out.println(s.length());
    	}
    	catch (NullPointerException e)
    	{
		    System.out.println("Exception Handled.");
		}
    	System.out.println("String value is not declared.");
	}
}
