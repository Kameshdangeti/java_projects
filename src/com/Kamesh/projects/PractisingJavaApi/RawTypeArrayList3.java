package com.Kamesh.projects.PractisingJavaApi;

import java.util.ArrayList;

public class RawTypeArrayList3 
{
	public static void main(String[] args)
	{
		ArrayList<Object> a= new ArrayList();
		a.add('M');
		a.add(33.3);
		a.add(333);
		a.add(null);
		a.add(true);
		System.out.println(a);
	}
}
