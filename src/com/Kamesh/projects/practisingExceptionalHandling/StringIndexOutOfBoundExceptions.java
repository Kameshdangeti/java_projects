package com.Kamesh.projects.practisingExceptionalHandling;

public class StringIndexOutOfBoundExceptions
{
    public static void main(String[] args)
    {
		String s="Lucky";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(4));
		try
		{
			System.out.println(s.charAt(5));
		}
		catch (StringIndexOutOfBoundsException e) 
		{
		    System.out.println("Invaid index outof boundary,String should be within the boundary");
		}
	}
}
