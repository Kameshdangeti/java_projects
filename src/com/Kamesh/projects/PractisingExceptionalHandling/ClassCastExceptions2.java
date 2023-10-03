package com.Kamesh.projects.PractisingExceptionalHandling;

public class ClassCastExceptions2 
{
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		try 
		{
			Father2 f2=(Father2) new Daughter2();
			f2.family();
			Daughter2 d2=(Daughter2) f2;
			d2.family();
			Son2 s2=(Son2) f2;
			s2.family();
		} 
		catch (ClassCastException e)
		{
			System.out.println("Down catsing is not possible without Upcasting.");
		}
	}

}
