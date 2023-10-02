package com.Kamesh.projects.PractisingExceptionalHandling;

public class InterruptedExceptions3
{
	public static void main(String[] args) 
	{
		System.out.println("Hii");
		try
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
}
