package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class PrintingJavaAnagrams {
	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length())
			return false;
		String A = a.toLowerCase();
		String B = b.toLowerCase();

		for (int i = 0; i < A.length(); i++) {
			B = B.replaceFirst(A.charAt(i) + "", "");
		}
		// System.out.println(B.length()+B);
		return B.length() == 0 ? true : false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
