package com.Kamesh.projects.PractisingExceptionalHandling;

public class StringIndexOutOfBoundExceptions5 {
	public static void main(String[] args) {
		String d = "RRKL";
		System.out.println(d.charAt(3));
		System.out.println(d.charAt(0));
		try {
			System.out.println(d.charAt(4));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Invalid index out of boundary,it should be within the string index.");
		}
	}
}
