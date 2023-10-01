package com.Kamesh.projects.PractisingJavaApi;

public class StringBuilder3 
{
   public static void main(String[] args) 
   {
	    String [] sa = {"EEE","ECE","MECH","CIVIL","CSE"};
	    String s= " ";
	    System.out.println("Before the String Object :"+s.hashCode());
	    for (String string : sa)
	    {
			 string=string+" ";
			 System.out.println("After the String Object :"+string.hashCode());
		}
   }
}
