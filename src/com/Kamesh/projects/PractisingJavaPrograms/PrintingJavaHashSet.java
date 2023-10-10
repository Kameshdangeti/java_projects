package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class PrintingJavaHashSet 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the t value.");
	        int t = sc.nextInt();
	        System.out.println("Enter the String :");
	        String [] pair_left = new String[t];
	        String [] pair_right = new String[t];
	        
	        for (int i = 0; i < t; i++) {
	            pair_left[i] = sc.next();
	            pair_right[i] = sc.next();
	        }
	       HashSet<String> hs = new HashSet<String>();
	        for(int i=0; i<t; i++)
	        {
	            hs.add(pair_left[i]+" "+pair_right[i]);
	            System.out.println(hs.size());
	        }        
	        sc.close();
	}
}
