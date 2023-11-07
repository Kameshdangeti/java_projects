package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class PrintingJavaSubStringComparisions {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		String[] str = new String[s.length() - k + 1];

		for (int i = 0; i < s.length() - k + 1; i++) {
			str[i] = s.substring(i, i + k);
		}
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1 - i; j++) {
				if (str[j].compareTo(str[j + 1]) > 0) {
					String temp = str[j + 1];
					str[j + 1] = str[j];
					str[j] = temp;
				}
			}

		}
		smallest = str[0];
		largest = str[str.length - 1];
		return smallest + "\n" + largest;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();
		System.out.println(getSmallestAndLargest(s, k));
	}
}
