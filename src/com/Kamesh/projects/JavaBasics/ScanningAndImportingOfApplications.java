//In the below code we run the code and created main method and imported the java pacakges.

package com.Kamesh.projects.JavaBasics;

import java.util.Scanner;          //Imported Scanner.

public class ScanningAndImportingOfApplications
{
   public static void main(String[] args)      //Main Method.
   {
	Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter your favourite color :");
	String color=sc.next();
	System.out.println("Enter your lucky number :");
	int no =sc.nextInt();
	System.out.println("your favourite color is :"+color);
	System.out.println("Your Lucky number is :"+no);
   }
}
