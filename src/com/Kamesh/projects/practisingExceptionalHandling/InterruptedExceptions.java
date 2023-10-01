package com.Kamesh.projects.practisingExceptionalHandling;

public class InterruptedExceptions 
{
	public static void main(String[] args) 
	{
		System.out.println("Good Morning");
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Good Afternoon");
	}
}
