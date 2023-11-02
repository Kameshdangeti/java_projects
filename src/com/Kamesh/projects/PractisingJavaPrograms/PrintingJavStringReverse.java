package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class PrintingJavStringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		StringBuilder str = new StringBuilder(A);
		String result = str.reverse().toString();

		if (A.equals(result)) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
		sc.close();
	}
}
