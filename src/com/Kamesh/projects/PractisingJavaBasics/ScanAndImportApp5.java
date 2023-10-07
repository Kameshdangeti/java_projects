package com.Kamesh.projects.PractisingJavaBasics;

import java.util.Scanner;

public class ScanAndImportApp5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Laptop Name");
		String lname = sc.next();
		System.out.println("Enter the Laptop generation");
		sc.nextInt();
		System.out.println("Enter the price of the Laptop");
		sc.nextDouble();
		System.out.println("Your information is stored");
		lname.getClass();
		sc.close();
	}
}
