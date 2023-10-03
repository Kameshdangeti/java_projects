package com.Kamesh.projects.PractisingJavaBasics;

import java.util.Scanner;

public class ScanAndImportApp4 
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Favspot");
		String favspot =sc.next();
		System.out.println("Enter the distance");
		String dis =sc.next();
		System.out.println("Enter the favfood");
		String favfood =sc.next();
	}
}
