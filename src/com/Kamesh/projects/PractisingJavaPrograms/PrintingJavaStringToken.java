package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class PrintingJavaStringToken {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if (s.trim().length() == 0) {
			System.out.println(0);
		} else {
			String[] result = s.trim().split("[ .,?!'@_]+");

			System.out.println(result.length);
			for (String token : result)
				System.out.println(token);
		}
		scan.close();
	}
}
