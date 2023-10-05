package com.Kamesh.projects.PractisingJavaBasics;

import java.util.Scanner;

public class ScanAndImportApp2 
{
public static void main(String[] args) 
{
Scanner s =new Scanner(System.in);
System.out.println("Enter Emp id :");
s.nextInt();
System.out.println("Enter the Emp name :");
String name=s.next();
System.out.println("Enter the Emp sal :");
s.nextDouble();
System.out.println("Enter the Emp ComName :");
String cname=s.next();
System.out.println("Your Information is stored");
name.getClass();
cname.getClass();
s.close();

}
}
