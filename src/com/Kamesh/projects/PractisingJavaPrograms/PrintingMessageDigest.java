package com.Kamesh.projects.PractisingJavaPrograms;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class PrintingMessageDigest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(input.getBytes());
			byte[] digest = md.digest();

			StringBuilder sb = new StringBuilder();
			for (byte b : digest) {
				sb.append(String.format("%02x", b));
			}

			System.out.println(sb.toString());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
