package com.Kamesh.projects.PractisingInheritance;

public class ThisKeyword2 
{
	public ThisKeyword2()
	{
		System.out.println("This Constructor has no Arguments.");
	}
    public ThisKeyword2(int a)
    {
    	this();
    	System.out.println("This Constructor has Integer Arguments.");
    	System.out.println("A :"+a);
    }
    public ThisKeyword2(double b)
    {
    	this(20);
    	System.out.println("This Constructor has Double Arguments.");
    	System.out.println("B :"+b);
    }
}
