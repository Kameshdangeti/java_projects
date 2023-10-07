package com.Kamesh.projects.PractisingExceptionalHandling;

public class StringIndexOutOfBoundExceptions3 {
	public static void main(String[] args) {
		String b = "Rama";
		System.out.println(b.charAt(1));
		System.out.println(b.charAt(3));
		try {
			System.out.println(b.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Invalid index out of boundary,it should be within the String Index.");
		}
	}
}
