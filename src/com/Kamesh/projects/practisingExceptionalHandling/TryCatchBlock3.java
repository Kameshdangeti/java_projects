package com.Kamesh.projects.practisingExceptionalHandling;

public class TryCatchBlock3 
{
    public static void main(String[] args) 
    {
		int a=300;
		int b=0;
		try 
		{
			int c=a/b;
		} 
		catch (Exception e) 
		{
              System.out.println("Exceptions handled");
		}
		System.out.println("Good Evening");
	}
}
