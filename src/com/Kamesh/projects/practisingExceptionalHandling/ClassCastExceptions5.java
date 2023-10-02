package com.Kamesh.projects.PractisingExceptionalHandling;

public class ClassCastExceptions5 
{
    public static void main(String[] args) 
    {
		try
		{
			Father5 f5=(Father5) new Daughter5();
			f5.kids();
			Daughter5 d5=(Daughter5) f5;
			d5.kids();
			Son5 s5=(Son5) f5;
			s5.kids();
		}
		catch (ClassCastException e) 
		{
			System.out.println("Downcasting is not possible without upcasting.");
		}
	}
}
