package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class CreatingJavaMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> phbook = new HashMap<String, Integer>();
		System.out.println("Enter the details:");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name");
			String name = sc.nextLine();
			System.out.println("Enter the phno");
			int phone = sc.nextInt();
			sc.nextLine();
			phbook.put(name, phone);
		}
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (phbook.containsKey(s)) {
				System.out.println(s + "=" + phbook.get(s));
			} else {
				System.out.println("Not found");
			}
		}
		sc.close();
	}

}
