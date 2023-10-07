package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class ReadinIntegerDoubleString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer value :");
		int i = sc.nextInt();
		System.out.println("Enter the double value :");
		double d = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the String value :");
		String s = sc.nextLine();
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		sc.close();
	}

}
