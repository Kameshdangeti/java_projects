package com.Kamesh.projects.PractsingLoopConstructor;

import java.util.LinkedHashSet;

public class EnhancedForLoop2 
{
	public static void main(String[] args)
	{
		LinkedHashSet<Object> l=new LinkedHashSet();
		l.add("Name : Kamesh");
		l.add("Age : 21");
		l.add("gender : Male");
		
		Object [] o=l.toArray();
		
	    for (int i = 0; i < o.length-1; i++)
	    {
			System.out.println(o[i]);
		}	
	    for (Object  details : l) 
	    {
			System.out.println(details);
		}
	}
}