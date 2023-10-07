package com.Kamesh.projects.PractisingExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchedExceptions2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer value :");
		try {
			String b = sc.next();
			System.out.println(b);
			sc.close();
		} catch (InputMismatchException e) {
			// TODO: handle exception
		}
	}
}
