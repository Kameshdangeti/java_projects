package com.Kamesh.projects.PractisingExceptionalHandling;

public class ClassCastExceptions4 
{
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		try 
		{
			Father4 f4=(Father4) new Daughter4();
			f4.kids();
			Daughter4 d4=(Daughter4) f4;
			d4.kids();
			Son4 s4=(Son4) f4;
			s4.kids();
		} 
		catch (ClassCastException e) 
		{
			System.out.println("DownCasting is not possible without Upcasting.");
		}
	}
}
