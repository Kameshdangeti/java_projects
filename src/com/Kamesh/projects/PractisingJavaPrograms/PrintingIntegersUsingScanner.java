package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class PrintingIntegersUsingScanner 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Integer-1");
		int a=scan.nextInt();
		System.out.println("Enter the Integer-2");
		int b=scan.nextInt();
		System.out.println("Enter the Integer-3");
		int c=scan.nextInt();
		System.out.println("Integer-1 value :"+a);
		System.out.println("Integer-2 value :"+b);
		System.out.println("Integer-3 value :"+c);
		scan.close();
	}
}
