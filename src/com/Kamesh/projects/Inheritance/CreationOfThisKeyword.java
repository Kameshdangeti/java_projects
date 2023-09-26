//Below we can see the code for this  keyword for constructor and objects.
//and the main method of this code is called in seperate class i.e.,"CreationOfThisKeywordMain.java"
package com.Kamesh.projects.Inheritance;

public class   CreationOfThisKeyword
{
	public CreationOfThisKeyword()
	{
	System.out.println("This constructor has no arguments.");
	}
	
	public CreationOfThisKeyword(int a)
    {
		this();
		System.out.println("This constructor has int argument.");
		System.out.println("A :"+a);
    }
	
	public CreationOfThisKeyword(double b)
	{
		this(10);
		System.out.println("This constrctor has double arguent.");
		System.out.println("B :"+b);
	}
}


