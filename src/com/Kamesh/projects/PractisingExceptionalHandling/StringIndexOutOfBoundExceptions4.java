package com.Kamesh.projects.PractisingExceptionalHandling;

public class StringIndexOutOfBoundExceptions4 {
	public static void main(String[] args) {
		String c = "Kamesh";
		System.out.println(c.charAt(2));
		System.out.println(c.charAt(4));
		try {
			System.out.println(c.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Invalid index out of boundary,it should be within the String Index.");
		}
	}
}
