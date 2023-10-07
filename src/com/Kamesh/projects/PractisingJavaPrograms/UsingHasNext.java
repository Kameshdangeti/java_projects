package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class UsingHasNext {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the statement :");
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
