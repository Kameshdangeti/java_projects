package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class PrintingSingleDimensionalArray
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the n value :");
		int n = sc.nextInt();
		System.out.println("Enter the Array Elements :");
        int[] a = new int[n];
        for(int i = 0; i< n;i++)
        {
            a[i] = sc.nextInt();
        }
        sc.close();
    	System.out.println("Array Elements are :");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(a[i]);
        }
	}
}
