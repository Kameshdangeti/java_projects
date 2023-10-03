package com.Kamesh.projects.PractisingforArraysCreationandUsing;

import java.util.Scanner;

public class OneDimensionalArray 
{
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
	   Scanner Sc=new Scanner(System.in);
	   System.out.println("Enter the size of the array");
	   int size=Sc.nextInt();
	   int []b=new int[size];
	   System.out.println("Enter the Array Elements");
	   for (int i = 0; i <= b.length-1; i++) 
	   {
		  b[i]=Sc.nextInt();
	   }
		System.out.println("Even index array elements are:");
	   for (int i = 0; i <= b.length-1; i++) 
	   {
		   if (i%2==0) 
		   {
			System.out.println(b[i]);
		   }
	   }
    }
}
