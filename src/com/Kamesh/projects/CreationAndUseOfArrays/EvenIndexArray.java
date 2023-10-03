//Below code shows the declaration and instantiate and initialize of One-dimensional Array.
//Write a program to print Even Index Elements in One-Dimensional Array.
package com.Kamesh.projects.CreationAndUseOfArrays;

import java.util.Scanner;

public class EvenIndexArray
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int size = sc.nextInt();
		int[]b=new int[size];                                //Array Declared and instantiated & initialization is done 
		System.out.println("Enter the Array Elements :");    //after the code is in run.
		for (int i = 0; i <= b.length-1; i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("The Even Index Elements are :");
		for (int i = 0; i <= b.length-1; i++) 
		{
			if (i%2==0)
			{
				System.out.println(b[i]);
			}
		}
	}
}
