package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintingTagContentExtractor {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String regex = "<([^<>]+)>([^<>]+)<\\/(\\1)>";// "<([^<>]+)>([^<>]+)<\\/(\\1)>";

		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			boolean check = false;
			String line = in.nextLine();
			Pattern patt = Pattern.compile(regex);
			Matcher matcher = patt.matcher(line);
			while (matcher.find()) {
				System.out.println(matcher.group(2));
				check = true;
			}
			if (check == false) {
				System.out.println("None");
			}
			testCases--;
		}
		in.close();
	}
}
