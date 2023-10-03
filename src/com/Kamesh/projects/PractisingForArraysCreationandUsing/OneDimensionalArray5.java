package com.Kamesh.projects.PractisingForArraysCreationandUsing;

import java.util.Scanner;

public class OneDimensionalArray5 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int size=sc.nextInt();
		int []b=new int[size];
		System.out.println("Enter the Array Elements:");
		for (int i = 0; i <= b.length-1; i++) 
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Even index array Elemnts are:");
		for (int i = 0; i <= b.length-1; i++) 
		{
			if (i%2==0) 
			{
			   System.out.println(b[i]);
			}
		}
	}
}
