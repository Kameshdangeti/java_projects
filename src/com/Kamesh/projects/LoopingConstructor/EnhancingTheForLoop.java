//Below we written the code for Enhancing the For loop. 
//And it can be enhanced by Array/Collection.
//The array can be any type(primitive or object etc).
//The collection or iterable can be (a list or a set).
package com.Kamesh.projects.LoopingConstructor;

import java.util.*;

public class EnhancingTheForLoop 
{
	public static void main(String[] args)
	{
		LinkedHashSet<Object> l=new LinkedHashSet();       //A set
		l.add("Name : Kamesh");
		l.add("Age : 21");
		l.add("Gender : Male");
		l.add("Date Of Birth : 09-02-2000");
		l.add("Height : 5.10");
		l.add("Occupation : Software Developer");
		l.add("Highest Qualification : B.Tech");
		
		
		Object [] o=l.toArray();                         //Primitive
		
		for (int i = 0; i < o.length-1; i++) 
		{
			System.out.println(o[i]);
		}
		
		
		for (Object details : l)                       //Object
		{ 
			System.out.println(details);
		}
		
		
		ArrayList a=new ArrayList();                    //List
		a.add("Name : Kamesh");
		a.add("Age : 21");
		a.add("Gender : Male");
		a.add("Date Of Birth : 09-02-2000");
		a.add("Height : 5.10");
		a.add("Occupation : Software Developer");
		a.add("Highest Qualification : B.Tech");
		
		ListIterator l1=a.listIterator();               //Primitive
		
		for (int j = 0; j < o.length-1; j++)
		{
			System.out.println(o[j]);
		}
		
		for (Object self : a)                           //Object
		{
			System.out.println(self);
		}
	}

}
