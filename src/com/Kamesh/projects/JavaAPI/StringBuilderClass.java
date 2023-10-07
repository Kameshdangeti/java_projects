//Below we can see the code for String Builder.

package com.Kamesh.projects.JavaAPI;

public class StringBuilderClass {
	public static void main(String[] args) {
		String[] StringArray = { "java_programming", "MYSQL", "Web_Technology", "Java_Library" };
		String s = " ";
		System.err.println("Before String Object :" + s.hashCode());
		for (String string : StringArray) {
			string = string + " ";
			System.out.println("String Object :" + string.hashCode());
		}
	}
}
