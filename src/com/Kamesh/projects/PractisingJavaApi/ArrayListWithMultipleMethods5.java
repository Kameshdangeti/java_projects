package com.Kamesh.projects.PractisingJavaApi;

import java.util.ArrayList;

public class ArrayListWithMultipleMethods5 {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add('S');
		a.add("Kamesh");
		a.add(9);
		a.add(55.55);
		a.add(null);
		a.add(true);
		System.out.println(a);
		System.out.println(a.contains("Kamesh"));
		System.out.println(a.get(3));
		System.out.println(a.set(1, 99));
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.remove(2));
		a.clear();
	}
}
