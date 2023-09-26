//Below we can see the code for super keyword for constructor and objects.
// And the code  main method is called in the "Father_main.java".
package com.Kamesh.projects.Inheritance;

public class CreationOfSuperKeyword 
{
	public CreationOfSuperKeyword()
	{
		System.out.println("Father is elder in family");
	}
}
class Son extends CreationOfSuperKeyword
{
	public Son()
	{
		super();
		System.out.println("Son is younger in the family");
	}
}

