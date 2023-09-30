package com.Kamesh.projects.PractisingInheritance;

public class AbstractClassMain 
{
	public static void main(String[] args)
	{
		TeamLead t1= new TeamLead();
		t1.Work();
		AbstractClass a1 =(AbstractClass) new TeamLead();
		a1.Work();
	}
}
