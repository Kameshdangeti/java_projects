package com.Kamesh.projects.PractisingExceptionalHandling;

public class ClassCastExceptions 
{
	public static void main(String[] args) 
	{
		try
		{
			Father f=(Father) new Daughter();
			Father.Family();
			Daughter d=(Daughter)  f;
			Daughter.Family();
			Son s=(Son) f;
			Father.Family();
			f=d;    //It is written
			f=s;    //to fix the warning that is variables f,d is not used.
		}
		catch (ClassCastException e)
		{
			System.out.println("Downcasting is not possible without upcasting.");
		}
	}
}
