package com.Kamesh.projects.PractisingExceptionalHandling;

public class ArithmeticException2 {
	public static void main(String[] args) {
		int a = 200;
		int b = 0;
		try {
			int c = a / b;
			a = c; // It is written to fix the Warning i.e.,'C' is not used.
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		System.out.println("HELLO");
	}
}
