package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class PrintingWordsUsingIfElseLoops
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value :");
		int n= sc.nextInt();
		if (n%2==1)
		{
			System.out.println("Weird");
		}
		else if(n%2==0 && n>=2&& n<=5)
		{
			System.out.println("Not Wired");
		}
	    else if(n%2==0 && n>=6 && n<=20)
		{
	    	System.out.println("Wired");
	    }
		else if(n%2==0 && n>20)
		{
			System.out.println("Not Wired");
	    }
		sc.close();
	}

}
