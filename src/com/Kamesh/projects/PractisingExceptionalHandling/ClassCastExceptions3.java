package com.Kamesh.projects.PractisingExceptionalHandling;

public class ClassCastExceptions3 
{
	public static void main(String[] args)
	{
		try 
		{
			Father3 f3=(Father3) new Daughter3();
			Father3.kids();
			Daughter3 d3=(Daughter3) f3;
			Daughter3.kids();
			Son3 s3=(Son3) f3;
			Son3.kids();
			f3=d3;    //It is written
			f3=s3;    //to fix the warning that is variables f3,d3 is not used any where.
		} 
		catch (ClassCastException e) 
		{
			System.out.println("Downcasting is not possible without Upcasting.");
		}
	}
}
