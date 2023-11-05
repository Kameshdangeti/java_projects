package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class PrintingJavaSubString 
{
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the words:");
	        String S = in.next();
	        System.out.println("Enter the staring no :");
	        int start = in.nextInt();
	        System.out.println("Enter the ending no :");
	        int end = in.nextInt();
	        System.out.println(S.substring(start, end));
	    }
}
