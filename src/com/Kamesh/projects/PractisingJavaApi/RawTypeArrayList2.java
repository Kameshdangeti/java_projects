package com.Kamesh.projects.PractisingJavaApi;

import java.util.ArrayList;

public class RawTypeArrayList2
{
	public static void main(String[] args) 
	{
		ArrayList<Object> a= new ArrayList<Object>();
		a.add('A');
		a.add(22.2);
		a.add(222);
		a.add(null);
		a.add(false);
		System.out.println(a);
	}
}
