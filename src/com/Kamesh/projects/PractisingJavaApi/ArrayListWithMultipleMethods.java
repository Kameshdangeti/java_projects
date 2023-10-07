package com.Kamesh.projects.PractisingJavaApi;

import java.util.ArrayList;

public class ArrayListWithMultipleMethods {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add('K');
		a.add("Lucky");
		a.add(9);
		a.add(11.11);
		a.add(null);
		a.add(false);
		System.out.println(a);
		System.out.println(a.contains("Lucky"));
		System.out.println(a.get(3));
		System.out.println(a.set(1, 99));
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.remove(2));
		a.clear();
	}
}
