package com.Kamesh.projects.PractisingJavaBasics;

import java.util.Scanner;

public class ScanAndImportApp3 
{
   public static void main(String[] args) 
   {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Bank Name");
	String bname=sc.next();
	System.out.println("Enter the Bank IFSC code");
	String ifsc=sc.next();
	System.out.println("Enter the Amount to be Debitted");
	double am=sc.nextDouble();
	System.out.println("Thank You");
	System.out.println("Vist Again");
   }
}
