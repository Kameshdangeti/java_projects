package com.Kamesh.projects.PractisingJavaBasics;

import java.util.Scanner;

public class ScanAndImportApp 
{
public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Name :");
	String name=sc.next();
	System.out.println("Enter your Age :");
	sc.nextInt();
	System.out.println("Enter your Qualification :");
	String qua=sc.next();
	System.out.println("your data is stored");
	name.getClass();
    qua.getClass();
    
	sc.close();
 }
}
