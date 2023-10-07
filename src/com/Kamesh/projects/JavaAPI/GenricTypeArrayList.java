//Below we can see the code for the ArrayList.
//and We Knew that ArrayList is of 2 types Genric type and Raw type.
//And we also multiple methods used in Lists.

//code for Genric Type.
package com.Kamesh.projects.JavaAPI;

import java.util.ArrayList;

public class GenricTypeArrayList {
	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList<Character>();
		a.add('K');
		a.add('A');
		a.add('M');
		a.add('E');
		a.add('S');
		a.add('H');
		a.add(null);
		System.out.println(a);
	}
}
