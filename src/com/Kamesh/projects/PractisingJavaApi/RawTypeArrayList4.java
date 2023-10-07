package com.Kamesh.projects.PractisingJavaApi;

import java.util.ArrayList;

public class RawTypeArrayList4 {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add('E');
		a.add(44.4);
		a.add(444);
		a.add(null);
		a.add(false);
		System.out.println(a);
	}
}
