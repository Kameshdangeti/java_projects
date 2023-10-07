package com.Kamesh.projects.PractisingJavaApi;

import java.util.ArrayList;

public class ArrayListWithMultipleMethods4 {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add('E');
		a.add("Rama");
		a.add(9);
		a.add(44.44);
		a.add(null);
		a.add(false);
		System.out.println(a);
		System.out.println(a.contains("Ramesh"));
		System.out.println(a.get(2));
		System.out.println(a.set(1, 99));
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.remove(2));
		a.clear();
	}
}
