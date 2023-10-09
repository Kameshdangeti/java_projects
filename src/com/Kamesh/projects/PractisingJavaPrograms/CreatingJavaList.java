package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatingJavaList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value :");
		int N = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		int Q = scan.nextInt();
		for (int i = 0; i < Q; i++) {
			String s = scan.next();
			if (s.equals("Insert")) {
				int index = scan.nextInt();
				int newInt = scan.nextInt();
				list.add(index, newInt);
			}
			if (s.equals("Delete")) {
				int index = scan.nextInt();
				list.remove(index);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		scan.close();
	}
}
