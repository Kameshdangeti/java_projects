package com.Kamesh.projects.PractisingJavaBasics;

import java.util.Scanner;

public class ScanAndImportApp 
{
 @SuppressWarnings({ "resource", "unused" })
public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Name :");
	String name=sc.next();
	System.out.println("Enter your Age :");
	int age=sc.nextInt();
	System.out.println("Enter your Qualification :");
	String Qua=sc.next();
	System.out.println("your data is stored");
 }
}
