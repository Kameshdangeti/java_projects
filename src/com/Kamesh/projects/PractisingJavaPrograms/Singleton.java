package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class Singleton {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Hello I am a singleton! Let me say " + str + " to you");
		sc.close();
	}

}
