package com.Kamesh.projects.PractisingForArraysCreationandUsing;

import java.util.Scanner;

public class OneDimensionalArray4 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[]b=new int[size];
		System.out.println("Enter the Array Elements:");
		for (int i = 0; i <=b.length-1; i++) 
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Even index Array Elments are:");
		for (int i = 0; i <=b.length-1; i++) 
		{
			if (i%2==0)
			{
				System.out.println(b[i]);
			}
		}
	}
}
