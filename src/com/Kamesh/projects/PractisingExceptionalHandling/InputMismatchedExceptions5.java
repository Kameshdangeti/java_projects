package com.Kamesh.projects.PractisingExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchedExceptions5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer value :");
		try {
			String e = s.next();
			System.out.println(e);
			s.close();
		} catch (InputMismatchException e) {
			// TODO: handle exception
		}
	}
}
