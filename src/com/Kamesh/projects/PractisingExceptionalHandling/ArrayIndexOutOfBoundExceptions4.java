package com.Kamesh.projects.PractisingExceptionalHandling;

public class ArrayIndexOutOfBoundExceptions4 {
	public static void main(String[] args) {
		int[] c = { 13, 14, 15, 16 };
		System.out.println(c[0]);
		try {
			System.out.println(c[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index of boundary in array,it should be within array index");
		}
	}
}
