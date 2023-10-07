package com.Kamesh.projects.PractisingJavaApi;

import java.util.ArrayList;

public class RawTypeArrayList {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add('K');
		a.add(11.1);
		a.add(111);
		a.add(null);
		a.add(true);
		System.out.println(a);
	}
}
