package com.Kamesh.projects.PractisingJavaApi;

import java.util.ArrayList;

public class RawTypeArrayList5
{
	public static void main(String[] args)
	{
		ArrayList<Object> a= new ArrayList();
		a.add('S');
		a.add(55.5);
		a.add(555);
		a.add(null);
		a.add(true);
		System.out.println(a);
	}
}
