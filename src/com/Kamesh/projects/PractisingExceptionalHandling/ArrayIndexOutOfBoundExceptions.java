package com.Kamesh.projects.PractisingExceptionalHandling;

public class ArrayIndexOutOfBoundExceptions {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(a[4]);
		try {
			System.out.println(a[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index boundaries in array it should be within array.");
		}
	}
}
