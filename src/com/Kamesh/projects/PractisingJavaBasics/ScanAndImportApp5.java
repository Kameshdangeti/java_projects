package com.Kamesh.projects.PractisingJavaBasics;

import java.util.Scanner;

public class ScanAndImportApp5
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Your Laptop Name");
  String Lapname=sc.next();
  System.out.println("Enter the Laptop generation");
  int lapgen =sc.nextInt();
  System.out.println("Enter the price of the Laptop");
  double lapprice =sc.nextDouble();
  System.out.println("Your information is stored");
}
}
