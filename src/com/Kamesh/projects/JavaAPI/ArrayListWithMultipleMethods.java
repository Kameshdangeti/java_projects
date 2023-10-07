//ArrayList With multiple Methods.

package com.Kamesh.projects.JavaAPI;

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
		System.out.println(a.contains("Lucky")); // checks particular object is present or not.
		System.out.println(a.get(3)); // Returns the particular objet based on index position.
		System.out.println(a.set(1, 99)); // Replaces the particular object based on index position.
		System.out.println(a); // Prints the replaced object.
		System.out.println(a.size()); // Calculates the length of the object based on information.
		System.out.println(a.isEmpty()); // Checks Whether the collection is empty or not.
		System.out.println(a.remove(2)); // Removes the particular object based on the index postion.
		a.clear(); // Clears the Collection.
	}
}
