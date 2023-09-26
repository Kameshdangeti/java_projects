//Below we can see the code for the Multi-dimensional Array with its declaration,instantiate,initialization.
//Write a program to print multi-Dimensional or 3-dimensional Array.
package com.Kamesh.projects.CreationAndUseOfArrays;

public class ThreeDimArray
{
	public static void main(String[] args) 
	{
		int[][][] a = {{{10,20,30},{40,50,60}},{{70,80,90,100},{50},{80,90}}};  
		
       //Declaration	            //Insatanitate and initialization of Multi-dimensional Array
		
		System.out.println("Multi-Dimensional Array are:");
		for (int[][] b:a) 
		{
			for(int[] c:b)
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


