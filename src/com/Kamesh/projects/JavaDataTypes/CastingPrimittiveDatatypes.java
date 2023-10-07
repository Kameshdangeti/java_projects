//In the below we can see the code for Casting primitive data types in
//both Automatically and Manually.
package com.Kamesh.projects.JavaDataTypes;

public class CastingPrimittiveDatatypes {
	public static void main(String[] args) {

		// Automatic Casting (conversion of integer value to double value)

		int Integer = 9;
		double Double = Integer;
		System.out.println("Integer value :" + Integer);
		System.out.println("Conversion of int to double :" + Double);

		// Manual Casting (conversion of double value to integer value)

		double Double1 = 99.9;
		int Integer1 = (int) Double1;
		System.out.println("Double value :" + Double1);
		System.out.println("conversion of double to int :" + Integer1);
	}
}
