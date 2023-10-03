package com.Kamesh.projects.PractisingExceptionalHandling;

public class ClassCastExceptions 
{
	public static void main(String[] args) 
	{
		try
		{
			Father f=(Father) new Daughter();
			f.Family();
			Daughter d=(Daughter)  f;
			d.Family();
			Son s=(Son) f;
			s.Family();
		}
		catch (ClassCastException e)
		{
			System.out.println("Downcasting is not possible without upcasting.");
		}
	}
}
