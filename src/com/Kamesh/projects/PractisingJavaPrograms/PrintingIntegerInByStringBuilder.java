package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class PrintingIntegerInByStringBuilder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			StringBuilder output = new StringBuilder();
			for (int j = 0; j < n; j++) {
				a += b << j;
				output.append(a + " ");
			}
			System.out.println(output.toString());
		}
		sc.close();
	}

}
