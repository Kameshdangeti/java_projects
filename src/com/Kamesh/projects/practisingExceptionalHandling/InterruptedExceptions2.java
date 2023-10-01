package com.Kamesh.projects.practisingExceptionalHandling;

public class InterruptedExceptions2 
{
	public static void main(String[] args) 
	{
		System.out.println("Good Evening.");
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Good Night.");
	}
}
