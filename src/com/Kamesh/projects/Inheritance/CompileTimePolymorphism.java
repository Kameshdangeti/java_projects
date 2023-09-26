  //Compile-Time Polymorphism.
//In this below code we can see the main method is not there .
//Becuse it is called in seperate class i.e.,"CompileTimePolymorphismMain.java".
package com.Kamesh.projects.Inheritance;

public class CompileTimePolymorphism 
{
	public static void add(int i, int k)
	{
		System.out.println(i+k);
	}
	public static void add(int i,double k)
	{
		System.out.println(i+k);
	}
	public static void add(int i,double k,int j)
	{
		System.out.println(i+j+k);
	}
}

