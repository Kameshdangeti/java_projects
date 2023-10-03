package com.Kamesh.projects.PractisingForArraysCreationandUsing;

public class MultiDimensionalArray
{
  public static void main(String[] args) 
  {
	int [][][] a= {{{10,20,30},{40,50,60}},{{80,90,100},{110,120,130}}};
	System.out.println("Multi Dimensional Array");
     for(int [][]b:a)
     {
    	 for(int []c:b)
    	 {
    		 for(int d:c)
    		 {
    			 System.out.println(d);
    		 }
    		 System.out.println();
    	 }
    	 System.out.println();
     }
  }
}
