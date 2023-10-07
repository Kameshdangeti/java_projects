//code for Raw Type ArrayList.

package com.Kamesh.projects.JavaAPI;

import java.util.ArrayList;

public class RawTypeArrayList {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add('A');
		a.add(13.9);
		a.add(777);
		a.add(true);
		a.add(null);
		System.out.println(a);
	}

}
